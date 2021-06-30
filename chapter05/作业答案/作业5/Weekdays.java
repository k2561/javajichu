package cn.jbit.loops1;

import java.util.Scanner;

public class Weekdays {

	/**
	 * 根据输入数字显示对应的英文星期名称缩写
	 */
	public static void main(String[] args) {
		int num = 0;
		String day = "";
		System.out.print("请输入数字1-7(输入0结束)：");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		while(num != 0){
			if(num >= 1 && num <= 7){	//数字合法
				switch(num){
				case 1:
					day = "MON";
					break;
				case 2:
					day = "TUE";
					break;
				case 3:
					day = "WED";
					break;
				case 4:
					day = "THU";
					break;
				case 5:
					day = "FRI";
					break;
				case 6:
					day = "SAT";
					break;
				case 7:
					day = "SUN";
					break;
				}
				System.out.println("今天是  " + day);
				System.out.print("请输入数字1-7(输入0结束)：");
				num = input.nextInt();
			}else{	//数字非法
				System.out.print("输入的数字非法，请重新输入：");
				num = input.nextInt();
			}
		}
		System.out.println("程序结束！");
	}

}
