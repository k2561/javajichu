import java.util.*;
public class Testloan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Loan  l= new Loan();
		Scanner input = new Scanner(System.in);
		System.out .print("����������");
		double loan=input.nextDouble();
		System.out .print("��ѡ��������ޣ�1.3��(36����) 2.5��(60����)  3.20�꣨240���£���");
		int yc=input.nextInt();				
		System.out.println("\n***�¹�Ϊ��"+l.loan(loan, yc));
	}

}
