package cn.jbit.classandobject;

public class InitialCustomer {

	public static void main(String[] args) {
		Customer cust = new Customer();	//创建客户对象
		cust.points = 1000;
		cust.cardType = "普卡";
		cust.show();
	}
}
