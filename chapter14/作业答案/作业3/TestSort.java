package cn.jbit.classandobject;
import java.util.Scanner;
public class TestSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentsBiz st = new StudentsBiz();	
		Scanner input = new Scanner(System.in);	
		
		st.inputNames();
		
		System.out.println("������Ҫ���ҵ�ѧ��������");
		String name=input.next();
		if(st.searchNames(st.names, name)){
			System.out.println("***�ҵ��ˣ�***");
		}else{
			System.out.println("***û�ҵ���***");
		}
		
	}
}
