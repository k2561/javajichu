/**
 * С��3:�ֳ����
 */
public class TempTable {
	public static void main(String[] args) {
		double f; // ����
		double c = 0; // ����
		int count = 1; // ��Ŀ
		System.out.println("�����¶�" + "\t�����¶�");
		do {
			f = c * 9 / 5.0 + 32; // ת��
			System.out.println(c + "\t" + f);
			c = c + 20;
			count++;
		} while (count <= 10 && c <= 250);
	}
}
