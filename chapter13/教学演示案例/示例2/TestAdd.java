package cn.jbit.classandobject;
import java.util.Scanner;

public class TestAdd {

	/**
	 * ���ۿΰ���2�������вη���
	 */
	public static void main(String[] args) {
		
		StudentsBiz st = new StudentsBiz();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("������ѧ��������");
			String newName = input.next();		
			st.addName(newName);
		}		
		st.showNames();
		
	}

}
