/**
 * @Title:LogAction.java
 * @Package:com.jit.z2206.common.log.action
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:42:51
 * @version V1.0
 */
package com.jit.z2206.common.log.action;

import com.jit.z2206.common.log.model.Log;
import com.jit.z2206.common.log.service.ILogService;
import com.jit.z2206.common.log.service.impl.ILogServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;





/**
 * @ClassName:LogAction
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:42:51
 * @version V1.0
 */
public class AddLogAction extends ActionSupport implements ModelDriven<Log>{
	
	private static final long serialVersionUID = 1L;
	private Log log = new Log();
	private ILogService iLogService = new ILogServiceImpl();
	private boolean flag;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Log getModel() {
		// TODO Auto-generated method stub
		return log;
	}

	/**
	 * @return the log
	 */
	public Log getLog() {
		return log;
	}

	/**
	 * @param log the log to set
	 */
	public void setLog(Log log) {
		this.log = log;
	}

	/**
	 * @return the iLogService
	 */
	public ILogService getiLogService() {
		return iLogService;
	}

	/**
	 * @param iLogService the iLogService to set
	 */
	public void setiLogService(ILogService iLogService) {
		this.iLogService = iLogService;
	}

	/**
	 * @return the flag
	 */
	public boolean isFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String execute() throws Exception {
		iLogService.addLogInfo(log);
		return SUCCESS;
	}

}
