package cn.jbit.classandobject;

import java.util.Scanner;
public class OldScoreCalc {

	/**
	 * 计算平均分和总成绩	
	 */
	public static void main(String[] args) {
		/* 接收成绩 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入Java成绩：");
		int java = input.nextInt();
		System.out.print("请输入C#成绩：");
		int c = input.nextInt();
		System.out.print("请输入DB成绩：");
		int db = input.nextInt();

		/* 计算并显示输出 */
		int total = java + c + db;
		double avg = total / 3;
		System.out.print("总成绩：" + total);
		System.out.print("\n平均分: " + avg);
	}

}
