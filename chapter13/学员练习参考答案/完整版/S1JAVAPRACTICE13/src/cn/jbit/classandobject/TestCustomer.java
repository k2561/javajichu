package cn.jbit.classandobject;

import java.util.*;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz cb=new CustomerBiz();
		boolean con=true;
		Scanner input = new Scanner(System.in);
		
		while(con){
			System.out .print("请输入客户的姓名：");
			String newName = input.next();
			cb.addName(newName);
			System.out .print("继续输入吗？（y/n）：");
			String choice=input.next();
			if(choice.equals("n")){
				con=false;
			}
		}
		cb.showNames();
		
		System.out.print("\n请输入要查找的客户姓名：");
		String name = input.next();
		System.out.println("*****查找结果*****");
		if(cb.search(name)){
			System.out.println("找到了！");
		}
		else{
			System.out.println("没找到！");
		}
	}
}
