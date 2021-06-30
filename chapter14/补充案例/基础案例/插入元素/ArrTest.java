import java.util.*;

public class ArrTest {

	public static void main(String[] args) {
		int[] arr1 = new int[]{85,63,49,22,10}; // 长度为为6的数组
			System.out.print("请输入要插入的数据： ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // 输入要插入的数据
		ArrTest test = new ArrTest();
		int[] arr2=test.insertNum(arr1,num);
		
		System.out.print("插入后的数组元素是： ");
		for (int i = 0; i < arr2.length; i++) { // 循环输出目前数组中的数据
			System.out.print(arr2[i] + "\t");
		}

	}
	/**
	 * 插入元素到数组指定位置
	 * @param arr
	 * @param num
	 * @return
	 */
	public int[] insertNum(int[] arr,int num){
		int i;
		for (i = 0; i < arr.length; i++) { // 查找要插入位置的元素下标
			if (num > arr[i]) {
				break;
			}
		}
		for (int j = arr.length - 1; j > i; j--) { // 为要插入的数留出位置
			arr[j] = arr[j - 1];
		}
		arr[i] = num;
		return arr;
	}

}
