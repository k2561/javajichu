/**
 * С��2:�ֳ����1
 */
public class CalcDays {
	public static void main(String[] args) {
		int days = 46; // ����
		int week = days / 7; // ����
		int leftDay = days % 7;// ʣ�������

		System.out.println(days + "�����" + week + "����" + leftDay + "��");
	}
}
