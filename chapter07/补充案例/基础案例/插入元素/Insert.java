import java.util.*;

public class Insert {

	public static void main(String[] args) {
		int[] list = new int[6]; // 长度为为6的数组
		list[0] = 85;
		list[1] = 63;
		list[2] = 49;
		list[3] = 22;
		list[4] = 10;

		System.out.print("请输入要插入的数据： ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // 输入要插入的数据
		int i;
		for (i = 0; i < list.length; i++) { // 查找要插入位置的元素下标
			if (num > list[i]) {
				break;
			}
		}

		for (int j = list.length - 1; j > i; j--) { // 为要插入的数留出位置
			list[j] = list[j - 1];
		}

		list[i] = num;
		System.out.print("插入后的数组元素是： ");
		for (i = 0; i < list.length; i++) { // 循环输出目前数组中的数据
			System.out.print(list[i] + "\t");
		}

	}

}
