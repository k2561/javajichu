package cn.jbit.ifdemo;

public class ScoreAssess {
	public static void main(String[] args) {
		int score = 70; // ���Գɼ�
		if (score >= 90) { // ���Գɼ�>=90
			System.out.println("����");
		} else if (score >= 80) { // 90>���Գɼ�>=80
			System.out.println("����");
		} else if (score >= 60) { // 80>���Գɼ�>=60
			System.out.println("�е�");
		} else { // ���Գɼ�<60
			System.out.println("��");
		}
	}
}
