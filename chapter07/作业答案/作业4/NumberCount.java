package cn.jbit.array;

import java.util.Scanner;

public class NumberCount {

	/**
	 * ͳ�ƺϷ����֣�1��2��3���ͷǷ����ֵĸ���
	 */
	public static void main(String[] args) {
		int[] num = new int[10];	//��������
		int[] count = new int[4];	//ͳ��ÿ�������ֵĸ���
		Scanner input = new Scanner(System.in);
		System.out.println("������10����");
		for(int i = 0; i < num.length; i++){
			num[i] = input.nextInt();
			switch(num[i]){
			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			default:
				count[3]++;
				break;
			}
		}
		System.out.println("���� 1 �ĸ�����" + count[0]);
		System.out.println("���� 2 �ĸ�����" + count[1]);
		System.out.println("���� 3 �ĸ�����" + count[2]);
		System.out.println("�Ƿ����ֵĸ�����" + count[3]);
	}

}
