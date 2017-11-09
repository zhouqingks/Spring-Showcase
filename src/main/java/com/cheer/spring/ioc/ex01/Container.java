/*
 * 文件名：aaa.java 版权：Copyright by www.cheer.com 描述： 修改人：皮皮周 修改时间：2017年11月8日
 */

package com.cheer.spring.ioc.ex01;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Container
{
    private static final Logger LOGGER = LogManager.getLogger(Container.class);

    // 存储类名和对象
    private Map<String, Object> objs = new HashMap<>();

    @SuppressWarnings("rawtypes")
    public void init()
    {
        try
        {
            for (Entry entry : loadFile("beans.config.properties").entrySet())
            {
                // 获取Class对象
                Class clazz = Class.forName(entry.getValue().toString());

                // 通过反射的方式创建对象
                Object obj = clazz.newInstance();
                
                objs.put(entry.getKey().toString(), obj);
                
            }
            
            for (Entry entry : this.loadFile("dependency.config.properties").entrySet())
            {
                if (objs.containsKey(entry.getKey()))
                {
                    Object obj = objs.get(entry.getKey().toString());

                    // 获取Class对象
                    Class clazz = obj.getClass();

                    @SuppressWarnings("unchecked")
                    Method method = clazz.getDeclaredMethod("setReportGenerator",
                        ReportGenerator.class);
                    method.invoke(obj, objs.get(entry.getValue()));
                }

            }
        }
        catch (ClassNotFoundException e)
        {
            LOGGER.catching(e);
        }
        catch (InstantiationException e)
        {
            LOGGER.catching(e);
        }
        catch (IllegalAccessException e)
        {
            LOGGER.catching(e);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (SecurityException e)
        {
            e.printStackTrace();
        }
    }

    public Properties loadFile(String name)
    {
        InputStream in = Container.class.getResourceAsStream("/" + name);
        Properties props = new Properties();
        try
        {
            props.load(in);
        }
        catch (IOException e)
        {
            LOGGER.info("{}配置文件不存在", name);
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    LOGGER.catching(e);
                }

            }
        }
        return props;
    }
    
    public Object getComponent(String name)
    {
        if (this.objs.size() == 0)
        {
            this.init();
        }

        return this.objs.get(name);

    }
}
