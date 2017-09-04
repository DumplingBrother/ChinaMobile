/**
 * @Title:ILogServiceImpl.java
 * @Package:com.jit.z2206.common.log.service.impl
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:40:06
 * @version V1.0
 */
package com.jit.z2206.common.log.service.impl;

import com.jit.z2206.common.log.dao.LogDao;
import com.jit.z2206.common.log.model.Log;
import com.jit.z2206.common.log.service.ILogService;

/**
 * @ClassName:ILogServiceImpl
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:40:06
 * @version V1.0
 */
public class ILogServiceImpl implements ILogService {
	
	private LogDao LogDao;
	
	/**
	 * @return the logDao
	 */
	public LogDao getLogDao() {
		return LogDao;
	}


	/**
	 * @param logDao the logDao to set
	 */
	public void setLogDao(LogDao logDao) {
		LogDao = logDao;
	}

	/* (non-Javadoc)
	 * @see com.jit.z2206.common.log.service.ILogService#addLogInfo(com.jit.z2206.common.log.model.Log)
	 */
	@Override
	public void addLogInfo(Log log) throws Exception {
		// TODO Auto-generated method stub
		LogDao.addLog(log);

	}


	

}
