import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("收到压岁钱的数目：");
		double money = input.nextDouble();
		if(money >= 1000){
			System.out.println("捐助失学儿童");
		}else if(money >= 500){
			System.out.println("购买航模");
		}else{
			System.out.println("购买百科全书");
		}
	}
}
