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
	/**
	 * ͨ����Ա��Ų��һ�Ա����
	 * @param custNo ��Ա���
	 * @return ��Ա����
	 */
	public int searchScore(String custNo){
		int i=0;
		int score = -1; // ��Ա����
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
		
		// ¼���Ա��Ϣ
		for(int i=0;i<4;i++){
			Customer cust = new Customer();
			System.out.print("�����Ա��ţ�");
			cust.custNo = input.next();		
			System.out.print("�����Ա���֣�");
			cust.custscore = input.nextInt();
			
			manager.add(cust);
		}
		
		manager.showCustomers();
		
		// ���һ���
		System.out.print("������Ҫ���ҵĻ�Ա��ţ�");
		String cunsNo = input.next();
		if(manager.searchScore(cunsNo)!=-1){
			System.out.println("�û�Ա����Ϊ��"+manager.searchScore(cunsNo));
		}else{
			System.out.print("û�иû�Ա�ţ���˶ԣ�");
		}
	}
}
