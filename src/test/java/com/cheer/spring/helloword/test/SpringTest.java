/*
 * 文件名：TestHelloword.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月7日
 */

package com.cheer.spring.helloword.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.spring.helloword.MessagePrinter;
import com.cheer.spring.helloword.MessageService;

public class SpringTest
{
    @Test
    public void testOldStyle()
    {
        MessageService msgService = new MessageService();
        MessagePrinter msgPrinter = new MessagePrinter();
        // 注入msgService对象
        msgPrinter.setMsgService(msgService);
        msgPrinter.messagePrint();
    }
    @Test
    public void testSpringStyle()
    {
        //------------Spring特性 IOC DI(Dependency Injection) 依赖注入
        //------------Spring的beans工厂帮助我们创建对象（通过反射的方式Class.forName("")）
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.beans.xml");
        MessagePrinter msgPrinter = context.getBean(MessagePrinter.class);
        msgPrinter.messagePrint();
    }
}
