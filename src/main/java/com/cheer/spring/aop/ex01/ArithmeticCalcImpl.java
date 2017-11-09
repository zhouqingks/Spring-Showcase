/*
 * 文件名：ArithmeticCalcImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.aop.ex01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArithmeticCalcImpl implements ArithmeticCalc
{
    private static final Logger LOGGER = LogManager.getLogger(ArithmeticCalcImpl.class);

    @Override
    public int add(int i, int j)
    {
        int result = i + j;
        
        return result;
        
    }

    @Override
    public int sub(int i, int j)
    {
        int result = i - j;
        return result;
        
    }

}
