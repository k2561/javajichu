package s1java.sg.chap8;

import java.util.*;

public class GuessData {

	public static void main(String[] args) {
		int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // 创建数组并赋值

		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数： ");
		int guess = input.nextInt();
		boolean isCorrect = false;
		for (int i = 0; i < list.length; i++) {
			if (guess == list[i]) {
				isCorrect = true;
				break;
			}
		}
		if (isCorrect) {
			System.out.println("猜对了！");
		} else {
			System.out.println("Sorry！");
		}
	}

}
