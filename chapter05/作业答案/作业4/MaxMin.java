package cn.jbit.loops1;

import java.util.Scanner;

public class MaxMin {

	/**
	 * ���һ�������е����ֵ����Сֵ
	 */
	public static void main(String[] args) {
		int num = 0;	//�û���ǰ���������
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������������0��������");
		num = input.nextInt();
		int max = num;	//��¼���ֵ
		int min = num;	//��¼��Сֵ
		while(num != 0){
			if(num > max){
				max = num;
			}else if(num < min){
				min = num;
			}
			System.out.print("������һ������������0��������");
			num = input.nextInt();
		}
		System.out.println("���ֵ�ǣ�" + max + " ��Сֵ�ǣ�" + min);
	}

}
