/*
 * 文件名：aaa.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ioc.annotation.dao.impl;

import org.springframework.stereotype.Repository;

import com.cheer.spring.ioc.annotation.dao.PetDao;

@Repository
public class PetDaoImpl implements PetDao
{

    @Override
    public int find(String name, String password)
    {
        if ("scott".equals(name) && "tiger".equals(password))
        {
            return 1;
        }
        return 0;

    }

}
