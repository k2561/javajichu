package cn.jbit.array;

import java.util.Scanner;

public class Points {

	/**
	 * ���»�Ա����
	 */
	public static void main(String[] args) {
		int[] points = new int[5];		//��ʷ��������
		int[] newPoints = new int[5];	//�����������
		System.out.println("������5λ��Ա�Ļ���");
		Scanner input =  new Scanner(System.in);
		for(int i = 0; i < points.length; i++){
			System.out.print("��" +(i+1)+ "λ��Ա���֣�");
			points[i] = input.nextInt();
		}
		//���鸴��
		for(int i = 0; i < points.length; i++){
			newPoints[i] = points[i];
			newPoints[i] = newPoints[i] + 500;	//����500����
		}
		//ѭ�����2����ȵĻ���
		System.out.println("\n���\t\t��ʷ����\t\t�������");
		for(int i = 0; i < points.length; i++){
			System.out.println((i+1) + "\t\t" + points[i]+ "\t\t" + newPoints[i]);
		}
	}
}
