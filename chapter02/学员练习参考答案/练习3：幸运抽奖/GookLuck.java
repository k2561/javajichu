package cn.jbit.myshopping;

import java.util.Scanner;

public class GookLuck {
	/*
	 * ���˳齱
	 */
	public static void main(String[] args) {
		int custNo; // �ͻ���Ա�ţ�˵����customer---�ͻ���
		
		// �����Ա����
		System.out.println("������4Ϊ��Ա���ţ�");
		Scanner input = new Scanner(System.in);
		custNo = input.nextInt();
		
		// ���ÿλ����
		int gewei = custNo % 10; // �ֽ��ø�λ��
		int shiwei = custNo / 10 % 10; // �ֽ���ʮλ��
		int baiwei = custNo / 100 % 10; // �ֽ��ð�λ��
		int qianwei = custNo / 1000; // �ֽ���ǧλ��
		
		// ��������֮��
		int sum = gewei + shiwei + baiwei + qianwei;
		System.out.println("��Ա����" + custNo + "��λ֮�ͣ� " + sum);
	}
}
