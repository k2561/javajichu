import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int num, sum, positive;
		Scanner input = new Scanner(System.in);
		sum = positive = 0;
		System.out.println("\n ������10�������������� 999 ��ֹ���롣\n");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			if (num == 999) {
				break;
			} else if (num < 0) {
				continue;
			} else {
				sum = sum + num;
				positive++;
			}
		}
		System.out.println("\n" + positive + "���������ܺ���: " + sum);

	}

}
