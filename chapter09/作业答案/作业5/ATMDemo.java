package cn.jbit.nestedloops;
import java.util.Scanner;
public class ATMDemo {
	/**
	 * ��ATM��ȡ�����ģ��
	 */
	public static void main(String[] args) {
		String pass = "";				//�����û���������
		int amount = 0;					//ȡ����
		String password = "111111";		//�û�����
		int count = 0;					//��¼�����������
		boolean isPass = false;			//�����Ƿ�ͨ����֤
		Scanner input = new Scanner(System.in);
		
		while(count < 3 && !isPass){
			System.out.print("���������룺");
			pass = input.next();
			if(!password.equals(pass)){
				count++;
				continue;
			}
			isPass = true;				//����ͨ����֤
			System.out.print("�������");
			amount = input.nextInt();
			while(amount>0){
				if(amount<=1000 && amount%100==0){
					System.out.println("��ȡ��" +amount+ "Ԫ");
					System.out.println("������ɣ���ȡ����");
					break;				//��ɽ��ף��˳�
				}else{
					System.out.print("��������Ľ��Ϸ������������룺");
					amount = input.nextInt();
					continue;			//�������û�������
				}
			}
		}
		if(!isPass){					//�û�������3�δ�������
			System.out.print("���������ȡ����");
		}
	}
}
