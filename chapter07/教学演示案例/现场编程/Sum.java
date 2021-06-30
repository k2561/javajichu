package s1java.sg.chap8;

/**
 * 小结2:现场编程2
 */
public class Sum {

	public static void main(String[] args) {
		int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // 创建数组并赋值
		int sum = 0;
		for (int i = 0; i < list.length; i++) { // 循环输出
			sum = sum + list[i];
		}
		System.out.println("和是：" + sum);
	}
}
