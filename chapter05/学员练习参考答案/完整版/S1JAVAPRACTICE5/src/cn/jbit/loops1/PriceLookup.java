package cn.jbit.loops1;

import java.util.Scanner;

public class PriceLookup {

	/**
	 * ��Ʒ�۸��ѯ
	 */
	public static void main(String[] args) {
		String name = "";		//��Ʒ����
		double price = 0.0;		//��Ʒ�۸�
		int goodsNo = 0;		//��Ʒ���
		System.out.println("MyShopping����ϵͳ  > �������\n");
		//��Ʒ�嵥
		System.out.println("*******************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T ��        2.����Ь        3.������");
		System.out.println("*******************************************");
		
		Scanner input = new Scanner(System.in);
		String answer = "y";	//��ʶ�Ƿ����
		
		while("y".equals(answer)){
			System.out.print("��������Ʒ��ţ�");
			goodsNo = input.nextInt();
			switch(goodsNo){
			case 1:
				name = "T ��";
				price = 245.0;
				break;
			case 2:
				name = "����Ь";
				price = 570.0;
				break;
			case 3:
				name = "������";
				price = 320.0;
				break;
			}
			System.out.println(name+ "\t" + "��" + price +"\n");
			System.out.print("�Ƿ������y/n��");
			answer = input.next();
		}
		System.out.println("���������");
	}
}
