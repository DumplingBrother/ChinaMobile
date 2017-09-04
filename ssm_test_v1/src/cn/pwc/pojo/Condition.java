/**
 * @Title:Condition.java
 * @Package:cn.pwc.pojo
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 2:42:40 PM
 * @version V1.0
 */
package cn.pwc.pojo;

import java.util.List;

/**
 * @ClassName:Condition
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 2:42:40 PM
 * @version V1.0
 */
public class Condition {
	
	private Integer deptno;
	private Double salary;
	private List<Integer> empnos;
	/**
	 * @return the deptno
	 */
	public Integer getDeptno() {
		return deptno;
	}
	/**
	 * @param deptno the deptno to set
	 */
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	/**
	 * @return the empnos
	 */
	public List<Integer> getEmpnos() {
		return empnos;
	}
	/**
	 * @param empnos the empnos to set
	 */
	public void setEmpnos(List<Integer> empnos) {
		this.empnos = empnos;
	}
	

}
