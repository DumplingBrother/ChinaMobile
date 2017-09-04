/**
 * @Title:EmpDao.java
 * @Package:cn.pwc.dao
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 2:44:20 PM
 * @version V1.0
 */
package cn.pwc.dao;

import java.util.List;

import cn.pwc.pojo.Condition;
import cn.pwc.pojo.Emp;

/**
 * @ClassName:EmpDao
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 2:44:20 PM
 * @version V1.0
 */
public interface EmpDao {
	/**
	 * 
	 * @Title:findAll
	 * @Description:查询全部
	 * @param @return
	 * @return List<Emp>
	 * @throws
	 */
	public List<Emp> findAll();
	
	/**
	 * 
	 * @Title:findByDept
	 * @Description:根据部门查询
	 * @param @param cond
	 * @param @return
	 * @return List<Emp>
	 * @throws
	 */
	public List<Emp> findByDept(Condition cond);
	/**
	 * 
	 * @Title:findBySalary
	 * @Description: 大于当前工资
	 * @param @param cond
	 * @param @return
	 * @return List<Emp>
	 * @throws
	 */
	public List<Emp> findBySalary(Condition cond);
	/**
	 * 
	 * @Title:findByDeptAndSalary
	 * @Description:查询当前部门下，大于当前收入的员工
	 * @param @param cond
	 * @param @return
	 * @return List<Emp>
	 * @throws
	 */
	public List<Emp> findByDeptAndSalary(Condition cond);
	/**
	 * 
	 * @Title:update
	 * @Description:更新员工信息
	 * @param @param emp
	 * @return void
	 * @throws
	 */
	public void update(Emp emp);
	/**
	 * 
	 * @Title:findByDeptAndSalary2
	 * @Description:查询当前部门下，大于当前收入的员工
	 * @param @param cond
	 * @param @return
	 * @return List<Emp>
	 * @throws
	 */
	public List<Emp> findByDeptAndSalary2(Condition cond);
	/**
	 * 
	 * @Title:update2
	 * @Description:更新员工信息
	 * @param @param emp
	 * @return void
	 * @throws
	 */
	public void update2(Emp emp);
	/**
	 * 
	 * @Title:findById
	 * @Description:根据id查询
	 * @param @param cond
	 * @param @return
	 * @return List<Emp>
	 * @throws
	 */
	public List<Emp> findById(Condition cond);

}
