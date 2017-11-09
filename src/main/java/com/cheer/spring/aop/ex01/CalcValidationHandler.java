/*
 * 文件名：CalcValidationHandler.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.aop.ex01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalcValidationHandler implements InvocationHandler
{
    private Object target;

    public CalcValidationHandler()
    {}

    public CalcValidationHandler(Object target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        for (Object arg : args)
        {
            vaildate((int)arg);
        }
        Object result = method.invoke(target, args);
        return result;
    }
    
    public static Object creatProxy(Object target)
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new CalcValidationHandler(target));
    }
    
    private void vaildate(int a)
    {
        if (a < 0)
        {
            throw new IllegalArgumentException("Positive numbers only");
        }
       
    }
}
