/**
 * @Title:EmpController.java
 * @Package:cn.pwc.controller
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 3:34:06 PM
 * @version V1.0
 */
package cn.pwc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pwc.dao.EmpDao;
import cn.pwc.pojo.Emp;

/**
 * @ClassName:EmpController
 * @Description:TODO
 * @author ZhuXiaosi
 * @date Aug 23, 2017 3:34:06 PM
 * @version V1.0
 */

@Controller
public class EmpController {
	
	@Resource
	private EmpDao empDao;
	public void setEmpDao(EmpDao empDao){
		this.empDao = empDao;
	}
	
	@RequestMapping("/findEmp.do")
	public String find(Model model){
		List<Emp> list = empDao.findAll();
		model.addAttribute("emps",list);
		return "emp_list";
	}

}
