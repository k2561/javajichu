package cn.jbit.myshopping;

import java.util.Scanner;
/*
 * 增加会员信息功能
 */
public class AddCust {
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统 > 客户信息管理 > 添加客户信息\n");
		/*录入会员信息*/
		Scanner input = new Scanner(System.in); 
		System.out.print("请输入会员号(<4位整数>)：");
		int custNo = input.nextInt();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String custBirth = input.next();
		System.out.print("请输入积分：");
		int custScore = input.nextInt();
		
		/*判断会员号有效性*/
		if(custNo >= 1000 && custNo <= 9999){
			System.out.println("\n已录入的会员信息是： ");
	        System.out.println(custNo + "\t" + custBirth + "\t" + custScore);
	    }else{
	        System.out.println("\n客户号" + custNo + "是无效会员号！");
	        System.out.println("录入信息失败！");
	    }
	}
}
