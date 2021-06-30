package cn.jbit.classandobject;
import java.util.Scanner;

public class TestModify {

	/**
	 * 理论课案例3：调用带2个参数的方法
	 */
	public static void main(String[] args) {
		StudentsBiz st = new StudentsBiz();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("请输入学生姓名：");
			String newName = input.next();		
			st.addName(newName);
		}		
		st.showNames();	
		
		System.out.print("\n请输入要修改的学生姓名：");
		String oldname = input.next();
		System.out.print("请输入新的学生姓名：");
		String newname = input.next();
		System.out.println("\n*****修改结果*****");
		if(st.editName(oldname, newname)){
			System.out.println("找到并修改成功！");
		}
		else{
			System.out.println("没找到该学生！");
		}
		st.showNames();	
	}

}
