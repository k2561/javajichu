package s1java.sg.chap8;

/**
 * С��2:�ֳ����2
 */
public class Sum {

	public static void main(String[] args) {
		int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // �������鲢��ֵ
		int sum = 0;
		for (int i = 0; i < list.length; i++) { // ѭ�����
			sum = sum + list[i];
		}
		System.out.println("���ǣ�" + sum);
	}
}
