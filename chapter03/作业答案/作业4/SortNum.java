
import java.util.Scanner;
/**
 * ��С��������
 * @author ��������
 *
 */
public class SortNum {
	public static void main(String[] args) {
		int a, b, c;
		int t;  //��ʱ����
		Scanner input = new Scanner(System.in);
		System.out.println("������a��ֵ��");
		a = input.nextInt();
		System.out.println("������b��ֵ��");
		b = input.nextInt();
		System.out.println("������c��ֵ��");
		c = input.nextInt();
		System.out.println("����ǰ" + a + "  " + b + "   " + c);
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
		System.out.println("�����" + a + "  " + b + "   " + c);

	}
}
