package cn.jbit.myshopping;

public class Pay {

	/*
	 * 购物结算
	 */
	public static void main(String[] args) {
		int shirtPrice = 245; //Ｔ恤价格
		int shoePrice = 570;  //网球鞋价格
		int padPrice = 320;   //网球拍价格
		int shirtNo=2;        //Ｔ恤件数
		int shoeNo =1;        //运动鞋数目
		int padNo = 1;        //网球拍数目
		double discount = 0.8;
		
		/*计算消费总金额*/
		double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
		System.out.println("消费总金额：" + finalPay);
	}
}
