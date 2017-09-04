/**
 * @Title:LogDaoImpl.java
 * @Package:com.jit.z2206.common.log.dao.impl
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:35:01
 * @version V1.0
 */
package com.jit.z2206.common.log.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.jit.z2206.common.log.dao.LogDao;
import com.jit.z2206.common.log.model.Log;

/**
 * @ClassName:LogDaoImpl
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:35:01
 * @version V1.0
 */
public class LogDaoImpl extends HibernateDaoSupport implements LogDao {

	/* (non-Javadoc)
	 * @see com.jit.z2206.common.log.dao.LogDao#addLog(com.jit.z2206.common.log.model.Log)
	 */
	@Override
	public void addLog(Log log) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(log);

	}

}
