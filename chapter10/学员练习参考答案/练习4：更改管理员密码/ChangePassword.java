package cn.jbit.classandobject;

import java.util.Scanner;

public class ChangePassword {

	/**
	 * ���Ĺ���Ա����
	 */
	public static void main(String[] args) {
		String nameInput;	//�����û�������û���
		String pwd;			//�����û����������
		String pwdConfirm;	//�����û��ٴ����������
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();	//��������Ա����
		admin.name = "admin1";						//��name���Ը�ֵ
		admin.password = "111111";					//��password���Ը�ֵ
		//����ɵ��û���������
		System.out.print("�������û�����");
		nameInput = input.next();
		System.out.print("���������룺");
		pwd = input.next();
		//�ж��û�������û����������Ƿ���ȷ
		if(admin.name.equals(nameInput) && admin.password.equals(pwd)){
			System.out.print("\n�����������룺");
			pwd = input.next();
			System.out.print("���ٴ����������룺");
			pwdConfirm = input.next();
			while(!pwd.equals(pwdConfirm)){
				System.out.println("��������������벻һ�£����������룡");
				System.out.print("\n�����������룺");
				pwd = input.next();
				System.out.print("���ٴ����������룺");
				pwdConfirm = input.next();
			}
			System.out.println("�޸�����ɹ�������������Ϊ��" + pwd);
		}else{
			System.out.print("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}
}
