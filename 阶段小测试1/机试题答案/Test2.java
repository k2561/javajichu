import java.util.Scanner;
/**
 * 输出一个四位整数的各位数字之和
 * @author 北大青鸟
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 输入一个四位整数
		System.out.println("请输入一个四位整数：");
		int num = input.nextInt();

		// 求出该数字的各位数字
		int num1 = num % 10;
		int num2 = num / 10 % 10;
		int num3 = num % 1000 / 100;
		int num4 = num / 1000;

		// 输出该数字的各位数字之和

		System.out.println(num + "各位数字之和为" + (num1 + num2 + num3 + num4));
	}

}
