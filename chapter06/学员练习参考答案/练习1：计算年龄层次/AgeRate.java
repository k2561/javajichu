package cn.jbit.loops2;
import java.util.Scanner;
public class AgeRate {
	public static void main(String[] args) {
		int young = 0;	//��¼����30�꣨�������¹˿͵�����
		int age = 0;	//����˿͵�����
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			System.out.print("�������" +(i+1)+ "λ�˿͵����䣺");
			age = input.nextInt();
			if(age > 0 && age <= 30){
				young++;
			}
		}
		System.out.println("30�����µı����ǣ�" + young/10.0*100 +"%");
		System.out.println("30�����ϵı����ǣ�" + (1-young/10.0)*100 +"%");
	}
}
