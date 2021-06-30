package cn.dbit.demo;
import java.util.Scanner;
/**
 * 课后作业：计算温度
 */
public class Farenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入当前的华氏温度：");
		
		double f = input.nextDouble();
		double c;

		c = 5/9.0 * (f-32); //转换

		/*显示结果*/
		System.out.println("\n当前的摄氏温度是: " + c);
	}
}
