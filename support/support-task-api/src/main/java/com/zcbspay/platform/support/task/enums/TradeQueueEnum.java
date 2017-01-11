/* 
 * TradeQueueEnum.java  
 * 
 * version TODO
 *
 * 2016年7月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.support.task.enums;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年7月19日 下午4:08:43
 * @since 
 */
public enum TradeQueueEnum {

	TRADEQUEUE("TRADEQUEUES"),
	TIMEOUTQUEUE("TIMEOUTQUEUES"),
	NOTIFYQUEUE("NOTIFYQUEUES"),
	REFUNDQUEUE("REFUNDQUEUES"),
	UNKNOW("");
	
	private String name;
	private TradeQueueEnum(String name){
        this.name = name;
    }
	
	public static TradeQueueEnum fromValue(int value) {
        for(TradeQueueEnum status:values()){
            if(status.name.equals(value)){
                return status;
            }
        }
        return UNKNOW;
    }
    
    public String getName(){
        return name;
    }
}
