
import java.util.Scanner;
/**
 * 由小到大排序
 * @author 北大青鸟
 *
 */
public class SortNum {
	public static void main(String[] args) {
		int a, b, c;
		int t;  //临时变量
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a的值：");
		a = input.nextInt();
		System.out.println("请输入b的值：");
		b = input.nextInt();
		System.out.println("请输入c的值：");
		c = input.nextInt();
		System.out.println("排序前" + a + "  " + b + "   " + c);
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		System.out.println("排序后" + a + "  " + b + "   " + c);

	}
}
