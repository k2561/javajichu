import java.util.Scanner;

public class MiniCal {

	public static void main(String[] args) {
		char opr = '/';
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个操作数: ");
		int data1 = input.nextInt();
		System.out.print("请输入第二个操作数：");
		int data2 = input.nextInt();
		int result = 0;

		switch (opr) {
		  case '+':
			result = data1 + data2;
			break;
		  case '-':
			result = data1 - data2;
			break;
		  case '*':
			result = data1 * data2;
			break;
		  case '/':
			result = data1 / data2;
			break;
		}

		System.out.println(data1 + " " + opr + " " + data2 + " = " + result);
	}
}
