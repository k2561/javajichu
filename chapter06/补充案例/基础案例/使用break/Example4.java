public class Example4 {

	public static void main(String[] args) {
		int sum = 0; // ��
		int i;
		for (i = 0; i < 100; i++) {
			if (i % 3 == 0) { // �ܱ�3��������ʼ��һ��ѭ��
				continue;
			}
			sum = sum + i; // �Բ��ܱ�3�����������
			if (sum >= 2000) { // �ͳ���2000����ѭ��
				break;
			}
		}
		System.out.println("�������ǣ�" + i);
	}

}
