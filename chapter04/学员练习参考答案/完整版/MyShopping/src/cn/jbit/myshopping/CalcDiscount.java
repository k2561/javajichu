package cn.jbit.myshopping;
import java.util.Scanner;

public class CalcDiscount {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���");
		String identity = input.next();
		System.out.println("�����빺���");
		double money = input.nextDouble();
		if(identity.equals("y")){ //��Ա
			if(money>200){
				money = money * 0.75;
			}else{
				money = money * 0.8;
			}
		}else{ //�ǻ�Ա
			if(money>100){
				money = money * 0.9;
			}
		}
		System.out.println("ʵ��֧����" + money);
	}
}
