package cn.jbit.loops1;

import java.util.Scanner;

public class DoWhileDemo {

	/**
	 * ���ʹ��do-whileѭ��
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";		//��ʶ�Ƿ�ϸ�
		do{
			System.out.println("�ϻ���д����");
			System.out.print("�ϸ�����?(y/n)");
			answer = input.next();
			System.out.println("");
		}while(!"y".equals(answer));
		System.out.println("��ϲ��ͨ���˲��ԣ�");
	}
}
