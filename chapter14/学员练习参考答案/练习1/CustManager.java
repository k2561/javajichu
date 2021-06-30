package com.wxws.sms;

import java.util.Scanner;

/**
 * 会员信息操作类
 */
public class CustManager {
	// 会员数组
	Customer[] customers = new Customer[100];
	
	/**
	 * 增加会员信息
	 * @param cust 新增会员
	 */
	public void add(Customer cust){
		for(int i=0;i<customers.length;i++){
			if(customers[i] == null){
				customers[i] = cust;
				break;
			}
		}
	}
	
	/**
	 * 输出会员信息
	 */
	public void showCustomers(){
		System.out.println("***会员列表***");
		System.out.println("编号\t积分");
		
		int i=0;
		while(customers[i] != null){
			System.out.println(customers[i].custNo+"\t"+customers[i].custscore);
			i++;
		}		
	}
	
	public static void main(String[] args) {
		CustManager manager = new CustManager();
		Customer cust = new Customer();
		
		Scanner input = new Scanner(System.in);	
		System.out.print("输入会员编号：");
		cust.custNo = input.next();		
		System.out.print("输入会员积分：");
		cust.custscore = input.nextInt();
		
		manager.add(cust);
		manager.showCustomers();
	}
}
