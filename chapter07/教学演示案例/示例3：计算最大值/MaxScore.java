package cn.jbit.array;

import java.util.Scanner;

public class MaxScore {

	/**
	 * 求数组最大值
	 */
	public static void main(String[] args) {
		int[] scores = new int[5];
		int max = 0;	//记录最大值
		System.out.println("请输入5位学员的成绩：");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		//计算最大值
		max = scores[0];
		for(int i = 1; i < scores.length; i++){
			if(scores[i] > max){
				max = scores[i];
			}
		}
		System.out.println("考试成绩最高分为：" + max);
	}
}
