package cn.jbit.loops2;

import java.util.Scanner;

public class LoginCheck {

	/**
	 * 验证用户名和密码（根据匹配情况执行不同操作）
	 */
	public static void main(String[] args) {
		int i = 0;
		String userName;
		String password;
		Scanner input = new Scanner(System.in);
		for(i = 0; i < 3; i++){
			System.out.print("请输入用户名：");
			userName = input.next();
			System.out.print("请输入密码：");
			password = input.next();
			if("jim".equals(userName) && "123456".equals(password)){	//匹配
				System.out.println("欢迎登录MyShopping系统！");
				break;
			}else{	//不匹配
				System.out.println("输入错误！您还有" +(2-i)+ "次机会！\n");
				continue;
			}
		}
		if(i == 3){	//3次都不匹配
			System.out.println("对不起，您3次均输入错误！");
		}
	}
}
