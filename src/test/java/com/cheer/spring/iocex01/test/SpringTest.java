/*
 * 文件名：aaa.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月8日
 */

package com.cheer.spring.iocex01.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.spring.helloword.MessagePrinter;
import com.cheer.spring.helloword.MessageService;
import com.cheer.spring.ioc.ex01.Container;
import com.cheer.spring.ioc.ex01.ReportService;

public class SpringTest
{
    @Test
    public void testIoc()
    {
        Container container = new Container();
        ReportService reportService = (ReportService)container.getComponent("reportService");
        Assert.assertNotNull(reportService);
        reportService.generateMonthlyReport();
    }
    

}