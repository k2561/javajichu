package cn.jbit.myshopping;

import java.util.*;

/**
 * ʹ��if-else�ṹʵ�����˳齱
 */
public class GoodLuck {

	public static void main(String[] args) {
		/* ��������� */
		int random = (int) (Math.random() * 10);

		/* �ӿ���̨����һ��4λ��Ա�� */
		System.out.println("�������ع������ϵͳ > ���˳齱\n");
		System.out.print("������4λ��Ա�ţ� ");
		Scanner input = new Scanner(System.in);
		int custNo = input.nextInt();

		/* �ֽ��ð�λ */
		int baiwei = custNo / 100 % 10;

		/* �ж��Ƿ������˻�Ա */
		if (baiwei == random) {
			System.out.println(custNo + "�����˿ͻ�������Mp3һ����");
		} else {
			System.out.println(custNo + "  лл����֧�֣�");
		}
	}
}
