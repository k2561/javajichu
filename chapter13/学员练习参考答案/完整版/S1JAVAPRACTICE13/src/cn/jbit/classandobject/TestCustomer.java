package cn.jbit.classandobject;

import java.util.*;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz cb=new CustomerBiz();
		boolean con=true;
		Scanner input = new Scanner(System.in);
		
		while(con){
			System.out .print("������ͻ���������");
			String newName = input.next();
			cb.addName(newName);
			System.out .print("���������𣿣�y/n����");
			String choice=input.next();
			if(choice.equals("n")){
				con=false;
			}
		}
		cb.showNames();
		
		System.out.print("\n������Ҫ���ҵĿͻ�������");
		String name = input.next();
		System.out.println("*****���ҽ��*****");
		if(cb.search(name)){
			System.out.println("�ҵ��ˣ�");
		}
		else{
			System.out.println("û�ҵ���");
		}
	}
}
