/**
 * С��3���ֳ����
 */
public class TestContinue {
	public static void main(String[] args) {
		int sum = 0; // ����һ�������������ۼ�
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;// ���iΪ����,��������ѭ����������һ��ѭ��
			}
			sum = sum + i;
		}
		System.out.print("1--10֮���ż������:" + sum);
	}
}
