/*
 * 文件名：CalcLoggingAspect.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月10日
 */

package com.cheer.spring.aop.ex02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalcLoggingAspect
{
    private static final Logger LOGGER = LogManager.getLogger(CalcLoggingAspect.class);
    
    @Before("execution(* ArithmeticCalc.add(..))")
    public void logBefore() 
    {
        LOGGER.info("The method add() begins");
    }
}
