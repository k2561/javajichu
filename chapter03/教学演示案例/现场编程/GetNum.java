import java.util.*;

/**
 * �ܽ᣺�ֳ����2
 */
public class GetNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������a�� ");
		int a = input.nextInt();
		System.out.print("������b�� ");
		int b = input.nextInt();
		if ((a % b == 0) || (a + b > 100)) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
