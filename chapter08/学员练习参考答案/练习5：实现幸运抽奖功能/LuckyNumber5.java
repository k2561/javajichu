package cn.jbit.dlc1;

import java.util.Scanner;

public class LuckyNumber5 {

	/**
	 * ���˳齱
	 */
	public static void main(String[] args) {
		String answer = "y"; // ��ʶ�Ƿ����
		String userName = ""; // �û���
		String password = ""; // ����
		int cardNumber = 0; // ����
		boolean isRegister = false; // ��ʶ�Ƿ�ע��
		boolean isLogin = false; // ��ʶ�Ƿ��¼
		int max = 9999;
		int min = 1000;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
			System.out.println("\t1.ע��");
			System.out.println("\t2.��¼");
			System.out.println("\t3.�齱");
			System.out.println("***************************");
			System.out.print("��ѡ��˵���");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("[���͸���ϵͳ > ע��]");
				System.out.println("����д����ע����Ϣ��");
				System.out.print("�û�����");
				userName = input.next();
				System.out.print("���룺");
				password = input.next();
				// ��ȡ4λ�������Ϊ����
				cardNumber = (int)(Math.random()*(max-min))+min;
				System.out.println("\nע��ɹ�����Ǻ����Ļ�Ա����");
				System.out.println("�û���\t����\t��Ա����");
				System.out.println(userName + "\t" + password + "\t" + cardNumber);
				isRegister = true; // ע��ɹ�����־λ����Ϊtrue
				break;
			case 2:
				System.out.println("[���͸���ϵͳ > ��¼]");
				if (isRegister) { // �ж��Ƿ�ע��
					// 3���������
					for (int i = 1; i <= 3; i++) {
						System.out.print("�������û�����");
						String inputName = input.next();
						System.out.print("���������룺");
						String inputPassword = input.next();
						if (userName.equals(inputName) && password.equals(inputPassword)) {
							System.out.println("\n��ӭ����" + userName);
							isLogin = true; // ��¼�ɹ�����־λ����Ϊtrue
							break;
						} else if (i < 3) {
							System.out.println("�û�����������󣬻���" + (3 - i) + "�λ��ᣡ");
						} else {
							System.out.println("��3�ξ��������");
						}
					}
				} else {
					System.out.println("����ע�ᣬ�ٵ�¼��");
				}
				break;
			case 3:
				System.out.println("[���͸���ϵͳ > �齱]");
				if (!isLogin) { // �ж��Ƿ��¼
					System.out.println("���ȵ�¼���ٳ齱��");
					System.out.println("�����𣿣�y/n��");
					answer = input.next();
				} else {
					//����5��4λ������֣���������������
					int[] luckynums = new int[5];
				    for(int i = 0; i < luckynums.length; i++){
				    	luckynums[i] = (int)(Math.random()*(max-min))+min;
				    }
					System.out.print("���������Ŀ��ţ�");
					int yourcard = input.nextInt();
					int i;
					System.out.print("\n���յ���������Ϊ��");
					for (i = 0; i < luckynums.length; i++) {
						System.out.print(luckynums[i] + "  ");
					}
					for (i = 0; i < luckynums.length; i++) {
						if (luckynums[i] == yourcard) {
							System.out.println("\n��ϲ�����Ǳ��յ����˻�Ա��");
							break;
						}
					}
					if (i == luckynums.length) {
						System.out.println("\n��Ǹ�������Ǳ��յ����˻�Ա��");
					}
				}
				break;
			default:
				System.out.println("[������������]");
				break;
			}
			System.out.print("�����𣿣�y/n��:");
			answer = input.next();
			System.out.println("");
		} while ("y".equals(answer));
		if ("n".equals(answer)) {
			System.out.println("ϵͳ�˳���ллʹ�ã�");
		}
	}
}
