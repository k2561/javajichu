package cn.jbit.ifdemo;

public class BuyCar2 {
	public static void main(String[] args) {
		int money = 52; // �ҵĴ���λ����Ԫ��
		if (money >= 500) {
			System.out.println("̫���ˣ��ҿ����򿭵�����");
		} else if (money >= 100) {
			System.out.println("�����ҿ�������������");
		} else if (money >= 10) {
			System.out.println("�����ҿ����������");
		} else if (money >= 50) {
			System.out.println("�ҿ�������������");
		} else {
			System.out.println("��������ֻ������ݰ�����");
		}
	}
}
