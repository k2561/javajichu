package cn.jbit.loops1;

import java.util.Scanner;

public class WhileDemo {

	/**
	 * ���ʹ��whileѭ��
	 */
	public static void main(String[] args) {
		String answer;	//��ʶ�Ƿ�ϸ�
		Scanner input = new Scanner(System.in);
		System.out.print("�ϸ�����?(y/n)��");
		answer = input.next();
		while(!"y".equals(answer)){
			System.out.println("�����Ķ��̲ģ�");
			System.out.println("�����ϻ���̣�\n");
			System.out.print("�ϸ�����?(y/n)��");
			answer = input.next();
		}
		System.out.println("���ѧϰ����");
	}
}
