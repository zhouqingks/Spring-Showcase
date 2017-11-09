/*
 * 文件名：MasterDaoImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ioc.annotation.dao.impl;

import org.springframework.stereotype.Repository;

import com.cheer.spring.ioc.annotation.dao.MasterDao;

@Repository
public class MasterDaoJdbcImpl implements MasterDao
{

    @Override
    public int findMaster()
    {
        return 1;
    }

}
