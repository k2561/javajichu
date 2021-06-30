public class Example4 {

	public static void main(String[] args) {
		int sum = 0; // 和
		int i;
		for (i = 0; i < 100; i++) {
			if (i % 3 == 0) { // 能被3整除，开始下一次循环
				continue;
			}
			sum = sum + i; // 对不能被3整除的数求和
			if (sum >= 2000) { // 和超过2000跳出循环
				break;
			}
		}
		System.out.println("该数字是：" + i);
	}

}
