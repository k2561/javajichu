package cn.jbit.loops2;

import java.util.Scanner;
public class AddCustomer {

	/**
	 * ѭ��¼���Ա��Ϣ
	 */
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n");
		int custNo = 0;	    //��Ա��						
		String birthday;	//��Ա����
		int points = 0;		//��Ա����
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){		//ѭ��¼���Ա��Ϣ
			System.out.print("�������Ա�ţ�<4λ����>����");
			custNo = input.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			birthday = input.next();
			System.out.print("�������Ա���֣�");
			points = input.nextInt();
			if(custNo < 1000 || custNo > 9999){	//��Ա����Ч������
				System.out.println("�ͻ���" +custNo+ "����Ч��Ա�ţ�");
				System.out.println("¼����Ϣʧ��\n");
				continue;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(custNo+ " " +birthday+ " " +points+ "\n");
		}
		System.out.println("���������");
	}
}
