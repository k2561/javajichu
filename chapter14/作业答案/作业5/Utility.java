
public class Utility {
	/**
	 * 向数组指定位置插入元素
	 * @param arr 数组
	 * @param index 位置
	 * @param value 元素值
	 */
	public void insertArray(int[] arr,int index,int value){			
		for (int j = arr.length - 1; j >=index; j--) { // 为要插入的数留出位置
			arr[j] = arr[j - 1];
		}
		arr[index-1] = value;	
	}

}
