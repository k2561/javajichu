/**
 * 小结3：现场编程
 */
public class TestContinue {
	public static void main(String[] args) {
		int sum = 0; // 定义一个变量，进行累加
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;// 如果i为奇数,结束本次循环，进行下一次循环
			}
			sum = sum + i;
		}
		System.out.print("1--10之间的偶数和是:" + sum);
	}
}
