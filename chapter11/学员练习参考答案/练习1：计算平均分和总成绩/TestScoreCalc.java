package cn.jbit.classandobject;
import java.util.*;

public class TestScoreCalc {
	public static void main(String[] args) {
		ScoreCalc sc = new ScoreCalc();
		/* ���ճɼ� */
		Scanner input = new Scanner(System.in);
		System.out.print("������Java�ɼ���");
		sc.java = input.nextInt();
		System.out.print("������C#�ɼ���");
		sc.c = input.nextInt();
		System.out.print("������DB�ɼ���");
		sc.db = input.nextInt();
		/* ���㲢����ɼ� */
		sc.showTotalScore();
		sc.showAvg();
	}
}
