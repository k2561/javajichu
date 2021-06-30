package cn.jbit.myshopping;

import java.util.Scanner;

public class ConsumeSavePlan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double money = input.nextDouble();
		double extra = 0;   //换购付款
		int choice = 0; //换购项目
		if(money>=50){
			System.out.println("是否参加优惠换购活动：");
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			System.out.println("2：满100元，加3元换购500ml可乐一瓶");
			System.out.println("3：满100元，加10元换购5公斤面粉");
			System.out.println("4：满200元，加10元可换购1个苏波尔炒菜锅");
			System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
			System.out.println("0：不换购");
			System.out.print("请选择：");
			if(input.hasNextInt()==true){
				choice = input.nextInt();
				switch(choice){
					case 1:
						if(money>=50){
							extra = 2;
						}
						break;
					case 2:
						if(money>=100){
							extra = 3;
						}
						break;
					case 3:
						if(money>=100){
							extra = 10;
						}
						break;
					case 4:
						if(money>=200){
							extra = 10;
						}
						break;
					case 5:
						if(money>200){
							extra = 20;
						}
						break;
					default:
						break;
				}
			}else{
				System.out.println("请输入正确的数字！");
			}
		}
		
		//结账
		double total = money + extra;
		System.out.println("本次消费总金额："+ total);
		if(choice == 1){
			System.out.println("成功换购：" + "百事可乐饮料1瓶。");
		}else if(choice ==2 ){
			System.out.println("成功换购：" + "500ml可乐一瓶。");
		}else if(choice == 3){
			System.out.println("成功换购：" + "5公斤面粉。");
		}else if(choice == 4){
			System.out.println("成功换购：" + "1个苏波尔炒菜锅。");
		}else if(choice == 5){
			System.out.println("成功换购：" + "欧莱雅爽肤水一瓶。");
		}else {
			System.out.println("无换购项目！");
		}
	}
}
