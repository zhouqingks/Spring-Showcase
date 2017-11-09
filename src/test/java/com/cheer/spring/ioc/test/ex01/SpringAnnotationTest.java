/*
 * 文件名：SpringAnnotationTest.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ioc.test.ex01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cheer.spring.ioc.annotation.service.MasterService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring.beans.annotation.xml")
public class SpringAnnotationTest
{
    @Autowired
    private MasterService masterService;
    
    @Test
    public void test()
    {
        Assert.assertEquals(1, masterService.find());
    }
}
