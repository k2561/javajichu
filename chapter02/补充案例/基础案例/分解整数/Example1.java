public class Example1 {
	public static void main(String[] args) {
		int num = 8461;
		int gewei = num % 10; // �ֽ��ø�λ��
		int shiwei = num / 10 % 10; // �ֽ���ʮλ��
		int baiwei = num / 100 % 10; // �ֽ��ð�λ��
		int qianwei = num / 1000; // �ֽ���ǧλ��
		System.out.println("����:  " + num);
		System.out.println("ǧλ����:  " + qianwei);
		System.out.println("��λ����:  " + baiwei);
		System.out.println("ʮλ����:  " + shiwei);
		System.out.println("��λ����:  " + gewei);
	}
}
