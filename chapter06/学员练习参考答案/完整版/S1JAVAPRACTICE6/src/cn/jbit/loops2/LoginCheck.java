package cn.jbit.loops2;

import java.util.Scanner;

public class LoginCheck {

	/**
	 * ��֤�û��������루����ƥ�����ִ�в�ͬ������
	 */
	public static void main(String[] args) {
		int i = 0;
		String userName;
		String password;
		Scanner input = new Scanner(System.in);
		for(i = 0; i < 3; i++){
			System.out.print("�������û�����");
			userName = input.next();
			System.out.print("���������룺");
			password = input.next();
			if("jim".equals(userName) && "123456".equals(password)){	//ƥ��
				System.out.println("��ӭ��¼MyShoppingϵͳ��");
				break;
			}else{	//��ƥ��
				System.out.println("�������������" +(2-i)+ "�λ��ᣡ\n");
				continue;
			}
		}
		if(i == 3){	//3�ζ���ƥ��
			System.out.println("�Բ�����3�ξ��������");
		}
	}
}
