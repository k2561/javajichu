package cn.jbit.myshopping;

import java.util.Scanner;
/*
 * ���ӻ�Ա��Ϣ����
 */
public class AddCust {
	public static void main(String[] args) {
		System.out.println("�������ع������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n");
		/*¼���Ա��Ϣ*/
		Scanner input = new Scanner(System.in); 
		System.out.print("�������Ա��(<4λ����>)��");
		int custNo = input.nextInt();
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
		String custBirth = input.next();
		System.out.print("��������֣�");
		int custScore = input.nextInt();
		
		/*�жϻ�Ա����Ч��*/
		if(custNo >= 1000 && custNo <= 9999){
			System.out.println("\n��¼��Ļ�Ա��Ϣ�ǣ� ");
	        System.out.println(custNo + "\t" + custBirth + "\t" + custScore);
	    }else{
	        System.out.println("\n�ͻ���" + custNo + "����Ч��Ա�ţ�");
	        System.out.println("¼����Ϣʧ�ܣ�");
	    }
	}
}
