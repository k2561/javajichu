
import java.util.Scanner;

public class Award {
	public static void main(String[] args) {
		System.out.print("���Գɼ��ǣ� ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt(); // ���Գɼ�
		if (score == 100) { // ���Գɼ�>=90
			System.out.println("���׸���������");
		} else if (score >= 90) { // 90>���Գɼ�>=80
			System.out.println("ĸ�׸�����̨�ʼǱ�����");
		} else if (score >= 60) { // 80>���Գɼ�>=60
			System.out.println("ĸ�׸������ֻ�");
		} else { // ���Գɼ�<60
			System.out.println("û������");
		}

	}

}
