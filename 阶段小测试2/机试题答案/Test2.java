import java.util.Random;
import java.util.Scanner;

/**
 * 猜数小游戏
 * @author 北大青鸟
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random() * 100); // 产生随机数
		int guess;// 用户猜的数字
		int count = 0;// 猜测次数
		System.out.println("我心里有一个0到99之间的整数，你猜是什么？");
		// 用户猜测随机数
		do {
			guess = input.nextInt();
			if (number < guess) {
				System.out.println("大了点，再猜！");
				count++;
			} else if (number > guess) {
				System.out.println("小了点，再猜！");
				count++;
			} else {
				count++;
				break;
			}
		} while (true);

		// 根据猜测次数给出评价
		if (count == 1) {
			System.out.println("你太聪明了！");
		} else if (count >= 2 && count <= 5) {
			System.out.println("不错，再接再厉！");
		} else {
			System.out.println("要努力啊！");
		}
	}
}
