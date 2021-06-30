package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * break断点演示：实现购物结账
 */
public class BreakDemo {
	public static void main(String[] args) {
		int count = 0;    //记录一共买了几件衣服
		String choice;    //顾客选择是否离开
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("欢迎光临第" + (i+1) + "家专卖店");
			for(int j = 0; j < 3; j++){
				System.out.print("要离开吗（y/n）？");
				choice = input.nextLine();
				if("y".equals(choice)){    //如果离开，则跳出，进入下一家店
					break;	
				}
				System.out.println("买了一件衣服");
				count++;
			}
			System.out.println("离店结账\n");
		}
		System.out.println("总共买了" + count + "件衣服");
		choice = input.nextLine();
	}
}
