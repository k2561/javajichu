package cn.jbit.ifdemo;

import java.util.Scanner;

public class Discount {

	/**
	 * @param args
	 */
	public static void main(String[] args)
    {
        int price = 4000;  // ��Ʊ��ԭ��
        int month;  // ���е��·�
        int type;   // ͷ�Ȳ�Ϊ1,���ò�Ϊ2
        Scanner input = new Scanner(System.in);
        System.out.println("�����������е��·ݣ�1��12");
        month = input.nextInt();
        System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
        type = input.nextInt();

        if (month >= 5 && month <= 10)  // ����
        {
            if (type == 1) // ͷ�Ȳ�
            {
            	System.out.println("���Ļ�Ʊ�۸�Ϊ��"+price * 0.9);
            }
            else if (type == 2)  // ���ò�
            {
            	System.out.println("���Ļ�Ʊ�۸�Ϊ��"+ price * 0.75);
            }                
        }
        else  // ����
        {
            if (type == 1) // ͷ�Ȳ�
            {
            	System.out.println("���Ļ�Ʊ�۸�Ϊ��"+ price * 0.6);
            }
            else if (type == 2)  // ���ò�
            {
            	System.out.println("���Ļ�Ʊ�۸�Ϊ��"+ price * 0.3);
            }                
        }
    }


}
