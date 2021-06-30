package cn.jbit.nestedloops;
import java.util.Scanner;
public class ATMDemo {
	/**
	 * 简单ATM机取款过程模拟
	 */
	public static void main(String[] args) {
		String pass = "";				//保存用户输入密码
		int amount = 0;					//取款金额
		String password = "111111";		//用户密码
		int count = 0;					//记录密码输入次数
		boolean isPass = false;			//密码是否通过验证
		Scanner input = new Scanner(System.in);
		
		while(count < 3 && !isPass){
			System.out.print("请输入密码：");
			pass = input.next();
			if(!password.equals(pass)){
				count++;
				continue;
			}
			isPass = true;				//密码通过验证
			System.out.print("请输入金额：");
			amount = input.nextInt();
			while(amount>0){
				if(amount<=1000 && amount%100==0){
					System.out.println("您取了" +amount+ "元");
					System.out.println("交易完成，请取卡！");
					break;				//完成交易，退出
				}else{
					System.out.print("您输入金额的金额不合法，请重新输入：");
					amount = input.nextInt();
					continue;			//继续让用户输入金额
				}
			}
		}
		if(!isPass){					//用户输入了3次错误密码
			System.out.print("密码错误，请取卡！");
		}
	}
}
