import java.util.Scanner;

/**
 * 输出斐波那契数列的前10个数
 * @author 北大青鸟
 *
 */
public class Test1 {

	public static void main(String[] args) {
		//定义num1、num2、num3三个变量，代表数列中连续的三个数
		int num1= 1;
		int num2 =1;
		int num3;
		int i=3;
		//输出数列的前两个数
		System.out.println(num1);
		System.out.println(num2);
		//输出数列的第三个数到第十个数
		while(i<=10){
			num3 = num1 + num2; //求出第i个数
			System.out.println(num3);//输出第i个数
			num1=num2; 
			num2=num3;
			i++;
			
		}

	}

}
