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
	}
}
