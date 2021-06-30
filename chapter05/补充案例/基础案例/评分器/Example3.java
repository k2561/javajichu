import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int count = 0;
		int score = 0;

		while (n <= 10) {
			System.out.print("第" + n + "局成绩： ");
			score = input.nextInt();
			if (score > 80) {
				count++;
			}
			n++;
		}
		double rate = count / 10.0; // 计算达到80分之上的比率
		if (rate > 0.9) {
			System.out.println("\n恭喜！通过一级");
		} else if (rate > 0.6) {
			System.out.println("\n通过二级，继续努力！");
		} else {
			System.out.println("\n加油啊！");
		}
	}
}
