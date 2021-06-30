package cn.jbit.array;

import java.util.Scanner;

public class Points {

	/**
	 * 更新会员积分
	 */
	public static void main(String[] args) {
		int[] points = new int[5];		//历史积分数组
		int[] newPoints = new int[5];	//新年积分数组
		System.out.println("请输入5位会员的积分");
		Scanner input =  new Scanner(System.in);
		for(int i = 0; i < points.length; i++){
			System.out.print("第" +(i+1)+ "位会员积分：");
			points[i] = input.nextInt();
		}
		//数组复制
		for(int i = 0; i < points.length; i++){
			newPoints[i] = points[i];
			newPoints[i] = newPoints[i] + 500;	//赠送500积分
		}
		//循环输出2个年度的积分
		System.out.println("\n序号\t\t历史积分\t\t新年积分");
		for(int i = 0; i < points.length; i++){
			System.out.println((i+1) + "\t\t" + points[i]+ "\t\t" + newPoints[i]);
		}
	}
}
