/**
 * С��1���ֳ����
 */
public class Training {
	public static void main(String[] args) {
		int year = 2006; // ���
		int students = 80000; // ѧ����
		while (students < 200000) {
			students = (int) (students * (1 + 0.25));
			year++;
			System.out.println(year + "�꣬��ѵ " + students + "��");
		}
		System.out.println(year + "�꣬����ѵ�˵���20����");
	}
}
