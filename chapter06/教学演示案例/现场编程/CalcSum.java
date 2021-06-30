/**
 * 小结1：现场编程
 */
public class CalcSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("和是：" + sum);
	}
}
