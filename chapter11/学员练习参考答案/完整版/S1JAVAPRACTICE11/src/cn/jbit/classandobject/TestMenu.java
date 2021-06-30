package cn.jbit.classandobject;
import java.util.Scanner;
/**
 * TestMenu.java 
 */

public class TestMenu {

	/**
	 * 测试菜单进出
	 */
	public static void main(String[] args) {        
        
		boolean con=true;
		do{
		 /*显示登录菜单*/
		Menu menu = new Menu();
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
