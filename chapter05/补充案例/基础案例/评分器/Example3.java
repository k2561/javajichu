import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int count = 0;
		int score = 0;

		while (n <= 10) {
			System.out.print("��" + n + "�ֳɼ��� ");
			score = input.nextInt();
			if (score > 80) {
				count++;
			}
			n++;
		}
		double rate = count / 10.0; // ����ﵽ80��֮�ϵı���
		if (rate > 0.9) {
			System.out.println("\n��ϲ��ͨ��һ��");
		} else if (rate > 0.6) {
			System.out.println("\nͨ������������Ŭ����");
		} else {
			System.out.println("\n���Ͱ���");
		}
	}
}
