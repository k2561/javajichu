package cn.jbit.classandobject;
import java.util.Scanner;
/**
 * TestMenu.java 
 */

public class TestMenu {

	/**
	 * 系统程序入口
	 */
	public static void main(String[] args) {        
        
		boolean con=true;
		do{
		 /*显示登录菜单*/
		Menu1 menu = new Menu1();
		menu.showLoginMenu();
		
		/*实现菜单*/
		Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
        	case 1:          
        		menu.showMainMenu();           
        		break;
        	case 2: 
        		System.out.println("谢谢您的使用！");
        		con=false;
        		break;
       }
	}while(con);
	}
}
