package cn.jbit.loops2;

import java.util.Scanner;
public class ContinueDemo {
	/**
	 * ͳ��80������ѧ������
	 */
	public static void main(String[] args) {
		int score; 		// �ɼ�
		int total; 		// �༶������
		int num = 0; 	// �ɼ����ڻ����80�ֵ�����
		Scanner input = new Scanner(System.in);
		System.out.print("����༶������: ");
		total = input.nextInt(); 	// ����༶����
		for (int i = 0; i < total; i++) {
			System.out.print("�������" + (i + 1) + "λѧ���ĳɼ��� ");
			score = input.nextInt();
			if (score < 80) {
				continue;
			}
			num++;
		}
		System.out.println("80�����ϵ�ѧ�������ǣ� " + num);
		double rate = (double) num / total * 100;
		System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ��" + rate + "%");
	}
}

