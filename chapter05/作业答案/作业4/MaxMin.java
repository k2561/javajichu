package cn.jbit.loops1;

import java.util.Scanner;

public class MaxMin {

	/**
	 * 输出一批整数中的最大值和最小值
	 */
	public static void main(String[] args) {
		int num = 0;	//用户当前输入的数字
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数（输入0结束）：");
		num = input.nextInt();
		int max = num;	//记录最大值
		int min = num;	//记录最小值
		while(num != 0){
			if(num > max){
				max = num;
			}else if(num < min){
				min = num;
			}
			System.out.print("请输入一个整数（输入0结束）：");
			num = input.nextInt();
		}
		System.out.println("最大值是：" + max + " 最小值是：" + min);
	}

}
