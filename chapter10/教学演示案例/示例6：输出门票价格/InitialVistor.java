package cn.jbit.classandobject;

import java.util.Scanner;
public class InitialVistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor v = new Visitor();		//��������
		System.out.print("������������");
		v.name = input.next();			//��name���Ը�ֵ
		System.out.print("���������䣺");
		v.age = input.nextInt();		//��age���Ը�ֵ
		v.show();                       //������ʾ��Ϣ����
	}
}
