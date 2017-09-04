/**
 * @Title:LogDao.java
 * @Package:com.jit.z2206.common.log.dao
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:13:58
 * @version V1.0
 */
package com.jit.z2206.common.log.dao;

import com.jit.z2206.common.log.model.Log;

/**
 * @ClassName:LogDao
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:13:58
 * @version V1.0
 */
public interface LogDao {
	
	void addLog(Log log) throws Exception;

}
