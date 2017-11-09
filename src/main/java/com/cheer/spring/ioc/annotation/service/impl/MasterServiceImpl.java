/*
 * 文件名：MasterServiceImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ioc.annotation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cheer.spring.ioc.annotation.dao.MasterDao;
import com.cheer.spring.ioc.annotation.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService
{
    
    @Resource(name = "masterDaoHibernateImpl")
    private MasterDao masterDao;

    @Override
    public int find()
    {
        
        return masterDao.findMaster();
    }

}
