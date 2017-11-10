/*
 * 文件名：AopCalcTest.java 版权：Copyright by www.cheer.com 描述： 修改人：皮皮周 修改时间：2017年11月10日
 */

package com.cheer.spring.aop.test.ex02;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cheer.spring.aop.ex02.ArithmeticCalc;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:springaop/spring.*.xml")
public class AopCalcTest
{
    private static final Logger LOGGER = LogManager.getLogger(AopCalcTest.class);

    @Autowired
    private ArithmeticCalc arithmeticCalc;

    @Test
    public void test()
    {
        arithmeticCalc.add(1, 1);
    }

}
