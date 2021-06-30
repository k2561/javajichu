package cn.jbit.dlc1;

import java.util.Scanner;

public class LuckyNumber3 {

	/**
	 * 幸运抽奖-注册
	 */
	public static void main(String[] args) {
		String answer = "y"; // 标识是否继续
		String userName = ""; // 用户名
		String password = ""; // 密码
		int cardNumber = 0; // 卡号
		boolean isRegister = false; // 标识是否注册
		int max = 9999;
		int min = 1000;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("***************************");
			System.out.print("请选择菜单：");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("[奖客富翁系统 > 注册]");
				System.out.println("请填写个人注册信息：");
				System.out.print("用户名：");
				userName = input.next();
				System.out.print("密码：");
				password = input.next();
				// 获取4位随机数作为卡号
				cardNumber = (int)(Math.random()*(max-min))+min;
				System.out.println("\n注册成功，请记好您的会员卡号");
				System.out.println("用户名\t密码\t会员卡号");
				System.out.println(userName + "\t" + password + "\t" + cardNumber);
				isRegister = true; // 注册成功，标志位设置为true
				break;
			case 2:
				System.out.println("[奖客富翁系统 > 登录]");
				break;
			case 3:
				System.out.println("[奖客富翁系统 > 抽奖]");
				System.out.println("[奖客富翁系统 > 抽奖]");
				break;
			default:
				System.out.println("[您的输入有误！]");
				break;
			}
			System.out.print("继续吗？（y/n）:");
			answer = input.next();
			System.out.println("");
		} while ("y".equals(answer));
		if ("n".equals(answer)) {
			System.out.println("系统退出，谢谢使用！");
		}
	}
}
