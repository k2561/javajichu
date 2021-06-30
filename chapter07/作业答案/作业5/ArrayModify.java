package cn.jbit.array;

public class ArrayModify {

	/**
	 * 逆序输出原数组，并将小于0的元素按0存储
	 */
	public static void main(String[] args) {
		int[] array = new int[]{1,3,-1,5,-2};
		int[] newArray = new int[array.length];
		System.out.println("原数组为：");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		//逆序并处理
		for(int i = array.length-1; i >= 0; i--){
			if(array[i] < 0){
				continue;
			}
			newArray[array.length-i-1] = array[i];
		}
		System.out.println("\n逆序并处理后的数组为：");
		for(int i = 0; i < newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
	}

}
