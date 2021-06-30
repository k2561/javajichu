package s1java.sg.chap8;

/**
 * 小结2: 现场编程1
 */
public class InitialArray {
	public static void main(String[] args) {
		int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // 创建数组并赋值
		for (int i = 0; i < list.length; i++) { // 循环输出
			System.out.println(list[i]);
		}
	}
}
