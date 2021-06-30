import java.util.*;

/**
 * 总结：现场编程2
 */
public class GetNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a： ");
		int a = input.nextInt();
		System.out.print("请输入b： ");
		int b = input.nextInt();
		if ((a % b == 0) || (a + b > 100)) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
