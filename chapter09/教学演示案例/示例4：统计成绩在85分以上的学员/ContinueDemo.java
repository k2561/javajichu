package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * continue断点演示：计算成绩85分以上的学员人数
 * 
 */
public class ContinueDemo {
	public static void main(String[] args) {
		int[] score = new int[4];				//成绩数组
		int classnum = 3;						//班级数目
		double sum = 0.0;						//成绩总和
		double average = 0.0;					//平均成绩
		
		int count = 0;							//记录85分以上学员人数
		
		//循环输入学员成绩
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < classnum; i++){
			sum = 0.0f;							//成绩总和归0
			System.out.println("请输入第" + (i+1) + "个班级的成绩");
			for(int j = 0; j < score.length; j++){
				System.out.print("第" + (j+1) + "个学员的成绩：");
				score[j] = input.nextInt();
				sum = sum + score[j];			//成绩累加
				
				if(score[j] < 85){	//成绩小于85，则跳出本轮循环
					continue;
				}
				count++;
			}
			average = sum / score.length;
			System.out.println("第" + (i+1) + "个班级参赛学员的平均分是：" + average + "\n");
		}
		System.out.println("成绩85分以上的学员人数有" + count + "人");
	}
}
