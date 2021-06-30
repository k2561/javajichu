package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * 计算3个班级的平均分
 */
public class AvgScore {
	public static void main(String args[]){
		int[] score = new int[4];				//成绩数组
		int classNum = 3;						//班级数目
		double sum = 0.0;						//成绩总和
		double average = 0.0;					//平均成绩

		//循环输入学员成绩
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < classNum; i++){
			sum = 0.0f;							//成绩总和归0
			System.out.println("请输入第" + (i+1) + "个班级的成绩");
			for(int j = 0; j < score.length; j++){
				System.out.print("第" + (j+1) + "个学员的成绩：");
				score[j] = input.nextInt();
				sum = sum + score[j];			//成绩累加
			}
			average = sum / score.length;	//计算平均分
			System.out.println("第" + (i+1) + "个班级参赛学员的平均分是：" + average + "\n");
		}
	}
}
