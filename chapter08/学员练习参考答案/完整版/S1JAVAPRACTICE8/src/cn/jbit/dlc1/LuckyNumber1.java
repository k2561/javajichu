package cn.jbit.dlc1;

import java.util.Scanner;

public class LuckyNumber1 {

	/**
	 * ���˳齱-ʵ�ֻ����߼��������ʾ
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("\t1.ע��");
		System.out.println("\t2.��¼");
		System.out.println("\t3.�齱");
		System.out.println("***************************");
		System.out.print("��ѡ��˵���");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("[���͸���ϵͳ > ע��]");
			break;
		case 2:
			System.out.println("[���͸���ϵͳ > ��¼]");
			break;
		case 3:
			System.out.println("[���͸���ϵͳ > �齱]");
			break;
		default:
			System.out.println("[������������]");
			break;
		}
	}
}
