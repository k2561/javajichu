package com.wxws.sms;

import java.util.Scanner;

/**
 * ��Ա��Ϣ������
 */
public class CustManager {
	// ��Ա����
	Customer[] customers = new Customer[100];
	
	/**
	 * ���ӻ�Ա��Ϣ
	 * @param cust ������Ա
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
	 * �����Ա��Ϣ
	 */
	public void showCustomers(){
		System.out.println("***��Ա�б�***");
		System.out.println("���\t����");
		
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
		System.out.print("�����Ա��ţ�");
		cust.custNo = input.next();		
		System.out.print("�����Ա���֣�");
		cust.custscore = input.nextInt();
		
		manager.add(cust);
		manager.showCustomers();
	}
}
