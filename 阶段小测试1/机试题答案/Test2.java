import java.util.Scanner;
/**
 * ���һ����λ�����ĸ�λ����֮��
 * @author ��������
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ����һ����λ����
		System.out.println("������һ����λ������");
		int num = input.nextInt();

		// ��������ֵĸ�λ����
		int num1 = num % 10;
		int num2 = num / 10 % 10;
		int num3 = num % 1000 / 100;
		int num4 = num / 1000;

		// ��������ֵĸ�λ����֮��

		System.out.println(num + "��λ����֮��Ϊ" + (num1 + num2 + num3 + num4));
	}

}
