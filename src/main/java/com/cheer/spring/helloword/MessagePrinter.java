/*
 * 文件名：MessagePrinter.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：皮皮周
 * 修改时间：2017年11月7日
 */

package com.cheer.spring.helloword;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessagePrinter
{
    private static final Logger LOGGER = LogManager.getLogger(MessagePrinter.class);
    
    private MessageService msgService;

    public void setMsgService(MessageService msgService)
    {
        this.msgService = msgService;
    }
    
    public void messagePrint()
    {
        LOGGER.info(this.msgService.getMessage());
    }
}
