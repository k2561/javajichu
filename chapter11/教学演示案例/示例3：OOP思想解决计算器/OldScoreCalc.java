package cn.jbit.classandobject;

import java.util.Scanner;
public class OldScoreCalc {

	/**
	 * ����ƽ���ֺ��ܳɼ�	
	 */
	public static void main(String[] args) {
		/* ���ճɼ� */
		Scanner input = new Scanner(System.in);
		System.out.print("������Java�ɼ���");
		int java = input.nextInt();
		System.out.print("������C#�ɼ���");
		int c = input.nextInt();
		System.out.print("������DB�ɼ���");
		int db = input.nextInt();

		/* ���㲢��ʾ��� */
		int total = java + c + db;
		double avg = total / 3;
		System.out.print("�ܳɼ���" + total);
		System.out.print("\nƽ����: " + avg);
	}

}
