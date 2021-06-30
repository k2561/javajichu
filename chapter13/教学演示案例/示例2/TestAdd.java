package cn.jbit.classandobject;
import java.util.Scanner;

public class TestAdd {

	/**
	 * 理论课案例2：调用有参方法
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
		
	}

}
