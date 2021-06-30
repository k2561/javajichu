package cn.jbit.ifdemo;

import java.util.Scanner;

public class Discount {

	/**
	 * @param args
	 */
	public static void main(String[] args)
    {
        int price = 4000;  // 机票的原价
        int month;  // 出行的月份
        int type;   // 头等舱为1,经济舱为2
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您出行的月份：1～12");
        month = input.nextInt();
        System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
        type = input.nextInt();

        if (month >= 5 && month <= 10)  // 旺季
        {
            if (type == 1) // 头等舱
            {
            	System.out.println("您的机票价格为："+price * 0.9);
            }
            else if (type == 2)  // 经济舱
            {
            	System.out.println("您的机票价格为："+ price * 0.75);
            }                
        }
        else  // 淡季
        {
            if (type == 1) // 头等舱
            {
            	System.out.println("您的机票价格为："+ price * 0.6);
            }
            else if (type == 2)  // 经济舱
            {
            	System.out.println("您的机票价格为："+ price * 0.3);
            }                
        }
    }


}
