package cn.jbit.classandobject;

import java.util.Scanner;

public class Visitor {
	String name;	//����
	int age;		//����
	
	public void show(){
		Scanner input = new Scanner(System.in);
		while(!"n".equals(name)){
			if(age>=18 && age<=60){		//�ж�����
				System.out.println(name + "������Ϊ��" + age +
					"����Ʊ�۸�Ϊ��20Ԫ\n" );
			}else{
				System.out.println(name + "������Ϊ��" + age + "����Ʊ���\n");
			}
			System.out.print("������������");
			name = input.next();			//��name���Ը�ֵ
			if(!"n".equals(name)){
				System.out.print("���������䣺");
				age = input.nextInt();			//��age���Ը�ֵ
			}
		}
		System.out.print("�˳�����");
	}
}
