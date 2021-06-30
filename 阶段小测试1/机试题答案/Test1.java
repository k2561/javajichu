import java.util.Scanner;

/**
 * 输出两个整数的和、差、积和商
 * @author 北大青鸟
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//输入两个整数
		System.out.println("请输入第一个整数：");
		int num1 = input.nextInt();
		System.out.println("请输入第一个整数：");
		int num2 = input.nextInt();
		//输出两个整数
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		//输出两个整数的和、差、积和商
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2));

	}

}
