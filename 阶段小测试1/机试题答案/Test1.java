import java.util.Scanner;

/**
 * ������������ĺ͡��������
 * @author ��������
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//������������
		System.out.println("�������һ��������");
		int num1 = input.nextInt();
		System.out.println("�������һ��������");
		int num2 = input.nextInt();
		//�����������
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		//������������ĺ͡��������
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2));

	}

}
