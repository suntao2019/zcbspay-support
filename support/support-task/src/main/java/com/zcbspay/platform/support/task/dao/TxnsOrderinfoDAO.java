package com.zcbspay.platform.support.task.dao;

import com.zcbspay.platform.support.common.dao.BaseDAO;
import com.zcbspay.platform.support.task.pojo.PojoTxnsOrderinfo;

/**
  * @ClassName: TxnsOrderinfoDAO
  * @Description: TODO
  * @author guojia
  * @date 2016年10月22日 下午7:43:46
  *
  */
public interface TxnsOrderinfoDAO extends BaseDAO<PojoTxnsOrderinfo>{

	/**
	 * 
	  * getTxnsOrderinfoByTxnseqno
	  * @Title: getTxnsOrderinfoByTxnseqno
	  * @Description: TODO
	  * @param txnseqno
	  * @return    参数
	  * @return PojoTxnsOrderinfo    返回类型
	  * @throws
	 */
	public PojoTxnsOrderinfo getTxnsOrderinfoByTxnseqno(String txnseqno);
}
