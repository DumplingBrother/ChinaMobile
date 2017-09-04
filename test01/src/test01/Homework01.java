package test01;

import test01.DefitionIO;
/**
 * 
 * @ClassName:Homework01
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月2日 上午11:24:21
 * @version V1.0
 */
public class Homework01 {

	public static void main(String args[])throws Exception{
		DefitionIO dio = new DefitionIO();
		System.out.println("请输入贷款本金：");
		double Principal = dio.inputDouble();
		System.out.println("请输入还款总期数：");
		int Tenor = dio.inputValue();
		System.out.println("请输入年利率：");
		double Annual_rate = dio.inputDouble();
		System.out.println("请输入还款方式：");
		int Int_type = dio.inputValue();
		System.out.println("请问是否默认为人民币？y/n");
		String f = dio.inputFlag();
		int Ccy = 0;
		if(f.equals("y")){
			Ccy = 156;
		}else{
			System.out.println("请输入贷款币别：");
			Ccy = dio.inputValue();
		}
		if(Int_type==1){
			if(Ccy==156){
				System.out.println("币种：RMB");
				}
			//每月归还本金
			double MONTHLY_PRINCIPAL=Principal/Tenor;
			//每月归还金额
			double MONTHLY_PAYMENT=0;
			//当前剩余本金
			double REMAINING_AMT=Principal;
			for(int i = 1;i<=Tenor;i++){
				//月利率
				double Month_rate = Annual_rate/12;
				//月还款利息
				double MONTHLY_INT = REMAINING_AMT*Month_rate;
				MONTHLY_PAYMENT = MONTHLY_PRINCIPAL+MONTHLY_INT;
				REMAINING_AMT=REMAINING_AMT-MONTHLY_PRINCIPAL;
				System.out.println("期数："+i+" "+"月还款金额："+MONTHLY_PAYMENT+" "+
						"月还款利息："+MONTHLY_INT+" "+"月还款本金："+MONTHLY_PRINCIPAL+" "+"当前剩余本金："+
						REMAINING_AMT);
				}
		}else{
			System.out.println("SORRY!暂无该还款方式");
		}
	}
}
