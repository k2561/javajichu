package cn.jbit.classandobject;
public class Customer {
	int points;			//积分
	String cardType;	//卡类型
	
	//显示信息方法
	public void show(){
		System.out.println("积分：" + points + "，卡类型：" + cardType);
	}
}
