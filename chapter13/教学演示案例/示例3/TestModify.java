package cn.jbit.classandobject;
import java.util.Scanner;

public class TestModify {

	/**
	 * ���ۿΰ���3�����ô�2�������ķ���
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
		
		System.out.print("\n������Ҫ�޸ĵ�ѧ��������");
		String oldname = input.next();
		System.out.print("�������µ�ѧ��������");
		String newname = input.next();
		System.out.println("\n*****�޸Ľ��*****");
		if(st.editName(oldname, newname)){
			System.out.println("�ҵ����޸ĳɹ���");
		}
		else{
			System.out.println("û�ҵ���ѧ����");
		}
		st.showNames();	
	}

}
