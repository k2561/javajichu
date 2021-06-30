package cn.jbit.myshopping;

import java.util.Scanner;

public class CalcDiscount2 {
	public static void main(String[] args){
		/* 输入会员积分 */
		System.out.print("请输入会员积分： ");
		Scanner input = new Scanner(System.in);
		int custScore = input.nextInt();
		double discount;

		/* 判断折扣 */
		if (custScore < 2000) {
			discount = 0.9;
		} else if (2000 <= custScore && custScore < 4000) {
			discount = 0.8;
		} else if (4000 <= custScore && custScore < 8000) {
			discount = 0.7;
		} else {
			discount = 0.6;
		}
		System.out.println("该会员享受的折扣是：" + discount);
	}
}
