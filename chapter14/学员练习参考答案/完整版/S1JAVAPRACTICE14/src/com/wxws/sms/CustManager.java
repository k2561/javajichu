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
	/**
	 * 通过会员编号查找会员积分
	 * @param custNo 会员编号
	 * @return 会员积分
	 */
	public int searchScore(String custNo){
		int i=0;
		int score = -1; // 会员积分
		while(customers[i]!=null){
			if(customers[i].custNo.equals(custNo)){
				score = customers[i].custscore;
				break;
			}
			i++;
		}
		return score;
	}
	public static void main(String[] args) {
		CustManager manager = new CustManager();		
		Scanner input = new Scanner(System.in);	
		
		// 录入会员信息
		for(int i=0;i<4;i++){
			Customer cust = new Customer();
			System.out.print("输入会员编号：");
			cust.custNo = input.next();		
			System.out.print("输入会员积分：");
			cust.custscore = input.nextInt();
			
			manager.add(cust);
		}
		
		manager.showCustomers();
		
		// 查找积分
		System.out.print("请输入要查找的会员编号：");
		String cunsNo = input.next();
		if(manager.searchScore(cunsNo)!=-1){
			System.out.println("该会员积分为："+manager.searchScore(cunsNo));
		}else{
			System.out.print("没有该会员号，请核对！");
		}
	}
}
