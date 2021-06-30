package cn.jbit.classandobject;
import java.util.*;

public class TestScoreCalc {
	public static void main(String[] args) {
		ScoreCalc sc = new ScoreCalc();
		/* 接收成绩 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入Java成绩：");
		sc.java = input.nextInt();
		System.out.print("请输入C#成绩：");
		sc.c = input.nextInt();
		System.out.print("请输入DB成绩：");
		sc.db = input.nextInt();
		/* 计算并输出成绩 */
		sc.showTotalScore();
		sc.showAvg();
	}
}
