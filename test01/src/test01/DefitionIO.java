/**
 * 
 */
package test01;

import java.util.Scanner;

import org.apache.log4j.Logger;


/**
 * 
 * @author 朱晓思
 *
 * 2017年4月17日 下午9:17:24
   since v1.0
 */
public class DefitionIO {
	
	private static Logger logger = Logger.getLogger(DefitionIO.class);
	//输入值的方法
	public int inputValue(){
		Scanner sc =new Scanner(System.in);	
		return sc.nextInt();
	}
	
	public float inputfloat(){
		Scanner sc = new Scanner(System.in);
		return sc.nextFloat();
	}
	public double inputDouble(){
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	//输入运算符的方法
	public String inputFlag(){
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	//打印结果
	public void printValue(int result){
		System.out.println(result);
		  // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message."); 
		
	}
	
}
