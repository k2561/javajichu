package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * 计算一个班的平均分
 */
public class AvgScore {
	public static void main(String args[]){
		int[] score = new int[4];		//成绩数组
		float sum = 0.0f;				//成绩总和
		float average = 0.0f;			//成绩平均值
		
		//循环输入学员成绩
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位学员的成绩");
		for(int i = 0; i < score.length; i++){
			System.out.print("第"+ (i+1) +"位学员的成绩：");
			score[i] = input.nextInt();
			sum = sum + score[i];	     //成绩累加
		}
		average = sum / score.length;	//计算平均值
		System.out.println("参赛学员的平均分是：" + average);
	}
}
