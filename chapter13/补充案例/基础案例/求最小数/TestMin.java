import java.util.Scanner;

public class TestMin {

	public int min(int a, int b, int c) {
		int min;
		min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 5;
		c = 7;
		TestMin t = new TestMin();
		int min = t.min(a, b, c);
		System.out.println("min=" + min);
	}
}
