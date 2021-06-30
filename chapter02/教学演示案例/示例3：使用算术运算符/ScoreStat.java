package cn.dbit.demo;
import java.util.Scanner;
public class ScoreStat {

	/**
	 * 成绩统计
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("STB的成绩是：");
		int stb = input.nextInt();     //STB分数
		System.out.print("Java的成绩是：");
		int java = input.nextInt();    //Java分数
		System.out.print("SQL的成绩是：");
		int sql = input.nextInt();     //SQL分数
		int diffen;       //分数差
		double avg;       //平均分
		System.out.println("-----------------------");
		System.out.println("STB\tJava\tSQL");
		System.out.println(stb + "\t" + java + "\t" + sql);
		System.out.println("-----------------------");
		diffen = java - sql; 			//计算Java课和SQL课的成绩差
		System.out.println("Java和SQL的成绩差：" + diffen);
		avg = (stb + java + sql) / 3;	//计算平均分
		System.out.println("3门课的平均分是: " + avg);
	}
}
