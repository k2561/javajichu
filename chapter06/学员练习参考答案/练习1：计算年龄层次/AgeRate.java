package cn.jbit.loops2;
import java.util.Scanner;
public class AgeRate {
	public static void main(String[] args) {
		int young = 0;	//记录年龄30岁（含）以下顾客的人数
		int age = 0;	//保存顾客的年龄
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			System.out.print("请输入第" +(i+1)+ "位顾客的年龄：");
			age = input.nextInt();
			if(age > 0 && age <= 30){
				young++;
			}
		}
		System.out.println("30岁以下的比例是：" + young/10.0*100 +"%");
		System.out.println("30岁以上的比例是：" + (1-young/10.0)*100 +"%");
	}
}
