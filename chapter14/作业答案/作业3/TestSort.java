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
		
		System.out.println("请输入要查找的学生姓名：");
		String name=input.next();
		if(st.searchNames(st.names, name)){
			System.out.println("***找到了！***");
		}else{
			System.out.println("***没找到！***");
		}
		
	}
}
