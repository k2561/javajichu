import java.util.*;

public class ArrTest {

	public static void main(String[] args) {
		int[] arr1 = new int[]{85,63,49,22,10}; // ����ΪΪ6������
			System.out.print("������Ҫ��������ݣ� ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // ����Ҫ���������
		ArrTest test = new ArrTest();
		int[] arr2=test.insertNum(arr1,num);
		
		System.out.print("����������Ԫ���ǣ� ");
		for (int i = 0; i < arr2.length; i++) { // ѭ�����Ŀǰ�����е�����
			System.out.print(arr2[i] + "\t");
		}

	}
	/**
	 * ����Ԫ�ص�����ָ��λ��
	 * @param arr
	 * @param num
	 * @return
	 */
	public int[] insertNum(int[] arr,int num){
		int i;
		for (i = 0; i < arr.length; i++) { // ����Ҫ����λ�õ�Ԫ���±�
			if (num > arr[i]) {
				break;
			}
		}
		for (int j = arr.length - 1; j > i; j--) { // ΪҪ�����������λ��
			arr[j] = arr[j - 1];
		}
		arr[i] = num;
		return arr;
	}

}
