import java.util.*;
public class Testloan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Loan  l= new Loan();
		Scanner input = new Scanner(System.in);
		System.out .print("请输入贷款金额：");
		double loan=input.nextDouble();
		System.out .print("请选择贷款年限：1.3年(36个月) 2.5年(60个月)  3.20年（240个月）：");
		int yc=input.nextInt();				
		System.out.println("\n***月供为："+l.loan(loan, yc));
	}

}
