
public class Utility {
	/**
	 * ������ָ��λ�ò���Ԫ��
	 * @param arr ����
	 * @param index λ��
	 * @param value Ԫ��ֵ
	 */
	public void insertArray(int[] arr,int index,int value){			
		for (int j = arr.length - 1; j >=index; j--) { // ΪҪ�����������λ��
			arr[j] = arr[j - 1];
		}
		arr[index-1] = value;	
	}

}
