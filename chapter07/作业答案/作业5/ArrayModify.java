package cn.jbit.array;

public class ArrayModify {

	/**
	 * �������ԭ���飬����С��0��Ԫ�ذ�0�洢
	 */
	public static void main(String[] args) {
		int[] array = new int[]{1,3,-1,5,-2};
		int[] newArray = new int[array.length];
		System.out.println("ԭ����Ϊ��");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		//���򲢴���
		for(int i = array.length-1; i >= 0; i--){
			if(array[i] < 0){
				continue;
			}
			newArray[array.length-i-1] = array[i];
		}
		System.out.println("\n���򲢴���������Ϊ��");
		for(int i = 0; i < newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
	}

}
