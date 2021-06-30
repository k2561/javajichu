package cn.jbit.myshopping;

import java.util.Scanner;
public class LoginMenu {
	/**
	 * 显示我行我素购物管理系统的登录菜单
	 */
	public static void main(String[] args) {
		System.out.println("\n\n\t\t\t欢迎使用我行我素购物管理系统1.0版\n\n");
		System.out.println("\t\t\t\t 1. 登 录 系 统\n\n");
		System.out.println("\t\t\t\t 2. 退 出\n\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");

		/* 从键盘获取信息，并执行相应操作---新加代码 */
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		  case 1:
		    /* 显示系统主菜单 */
		    System.out.println("\n\n\t\t\t\t欢迎使用我行我素购物管理系统\n");
		    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		    System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
		    System.out.println("\t\t\t\t 2. 购 物 结 算\n");
		    System.out.println("\t\t\t\t 3. 真 情 回 馈\n");
		    System.out.println("\t\t\t\t 4. 注 销\n");
		    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		    System.out.print("请选择,输入数字:");
		    break;
		  case 2:
		    /* 退出系统 */
		    System.out.println("谢谢您的使用！");
		    break;
		  default:
		    System.out.println("输入错误。");
		    break;
		}
	}
}
