package cn.jbit.loops1;

import java.util.Scanner;

public class PriceLookup {

	/**
	 * 商品价格查询
	 */
	public static void main(String[] args) {
		String name = "";		//商品名称
		double price = 0.0;		//商品价格
		int goodsNo = 0;		//商品编号
		System.out.println("MyShopping管理系统  > 购物结算\n");
		//商品清单
		System.out.println("*******************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T 恤        2.网球鞋        3.网球拍");
		System.out.println("*******************************************");
		
		Scanner input = new Scanner(System.in);
		String answer = "y";	//标识是否继续
		
		while("y".equals(answer)){
			System.out.print("请输入商品编号：");
			goodsNo = input.nextInt();
			switch(goodsNo){
			case 1:
				name = "T 恤";
				price = 245.0;
				break;
			case 2:
				name = "网球鞋";
				price = 570.0;
				break;
			case 3:
				name = "网球拍";
				price = 320.0;
				break;
			}
			System.out.println(name+ "\t" + "￥" + price +"\n");
			System.out.print("是否继续（y/n）");
			answer = input.next();
		}
		System.out.println("程序结束！");
	}
}
