/*
 * 文件名：AopCalcTest.java 版权：Copyright by www.cheer.com 描述： 修改人：皮皮周 修改时间：2017年11月9日
 */

package com.cheer.spring.aop.test.ex01;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.cheer.spring.aop.ex01.ArithmeticCalc;
import com.cheer.spring.aop.ex01.ArithmeticCalcImpl;
import com.cheer.spring.aop.ex01.CalcLoggingHandler;
import com.cheer.spring.aop.ex01.CalcValidationHandler;


public class AopCalcTest
{
    private static final Logger LOGGER = LogManager.getLogger(AopCalcTest.class);

    @Test
    public void test()
    {
        ArithmeticCalc arithmeticCalcImpl = new ArithmeticCalcImpl();

        ArithmeticCalc arithmeticCalc = (ArithmeticCalc)CalcValidationHandler.creatProxy(
            CalcLoggingHandler.createProxy(arithmeticCalcImpl));
        
        LOGGER.info(arithmeticCalc.add(12, 13));

    }
}
