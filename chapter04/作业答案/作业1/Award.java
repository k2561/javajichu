
import java.util.Scanner;

public class Award {
	public static void main(String[] args) {
		System.out.print("考试成绩是： ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt(); // 考试成绩
		if (score == 100) { // 考试成绩>=90
			System.out.println("父亲给她买辆车");
		} else if (score >= 90) { // 90>考试成绩>=80
			System.out.println("母亲给她买台笔记本电脑");
		} else if (score >= 60) { // 80>考试成绩>=60
			System.out.println("母亲给她买部手机");
		} else { // 考试成绩<60
			System.out.println("没有礼物");
		}

	}

}
