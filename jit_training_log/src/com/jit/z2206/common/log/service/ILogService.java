/**
 * @Title:ILogService.java
 * @Package:com.jit.z2206.common.log.service
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:14:46
 * @version V1.0
 */
package com.jit.z2206.common.log.service;

import com.jit.z2206.common.log.model.Log;

/**
 * @ClassName:ILogService
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:14:46
 * @version V1.0
 */
public interface ILogService {
	
	public void addLogInfo(Log log)throws Exception;

}
