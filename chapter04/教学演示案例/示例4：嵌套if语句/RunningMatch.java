package cn.jbit.ifdemo;
import java.util.*;
public class RunningMatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������ɼ���s����");
		double score = input.nextDouble();
		System.out.print("�������Ա�");
		String gender = input.next();
		if(score<=10){
			if(gender.equals("��")){
				System.out.println("���������������");
			}else if(gender.equals("Ů")){
				System.out.println("����Ů���������");
			}
		}else{
			System.out.println("��̭��");
		}
	}
}
