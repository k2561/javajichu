package cn.jbit.loops2;

import java.util.Scanner;
public class AddCustomer {

	/**
	 * 循环录入会员信息
	 */
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统 > 客户信息管理 > 添加客户信息\n");
		int custNo = 0;	    //会员号						
		String birthday;	//会员生日
		int points = 0;		//会员积分
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){		//循环录入会员信息
			System.out.print("请输入会员号（<4位整数>）：");
			custNo = input.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			birthday = input.next();
			System.out.print("请输入会员积分：");
			points = input.nextInt();
			if(custNo < 1000 || custNo > 9999){	//会员号无效则跳出
				System.out.println("客户号" +custNo+ "是无效会员号！");
				System.out.println("录入信息失败\n");
				continue;
			}
			System.out.println("您录入的会员信息是：");
			System.out.println(custNo+ " " +birthday+ " " +points+ "\n");
		}
		System.out.println("程序结束！");
	}
}
