package cn.jbit.array;

import java.util.Scanner;

public class ArrayDemo {

	/**
	 * ʹ���������ƽ����
	 */
	public static void main(String[] args) {
		int[] scores = new int[5];	//�ɼ�����
		int sum = 0;				//�ɼ��ܺ�
		Scanner input = new Scanner(System.in);
		System.out.println("������5λѧԱ�ĳɼ���");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
			sum = sum + scores[i];	//�ɼ��ۼ�
		}
		//���㲢���ƽ����
		System.out.println("ѧԱ��ƽ�����ǣ�" + (double)sum/scores.length);
	}
}
