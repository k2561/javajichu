import java.util.*;
public class TestCalc {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner input = new Scanner(System.in);
		
		System.out .print("请选择运算：1.加法 2.减法  3.乘法 4.除法：");
		int op=input.nextInt();
		System.out .print("请输入第一个数：");
		int num1=input.nextInt();
		System.out .print("请输入第二个数：");
		int num2=input.nextInt();		
		System.out.println("***运算结果为："+calc.ope(op, num1, num2));
	}
}
