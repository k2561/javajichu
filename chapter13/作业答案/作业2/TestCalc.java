import java.util.*;
public class TestCalc {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner input = new Scanner(System.in);
		
		System.out .print("��ѡ�����㣺1.�ӷ� 2.����  3.�˷� 4.������");
		int op=input.nextInt();
		System.out .print("�������һ������");
		int num1=input.nextInt();
		System.out .print("������ڶ�������");
		int num2=input.nextInt();		
		System.out.println("***������Ϊ��"+calc.ope(op, num1, num2));
	}
}
