package cn.jbit.classandobject;
import java.util.Scanner;
/**
 * TestMenu.java 
 */

public class TestMenu {

	/**
	 * ���Բ˵�����
	 */
	public static void main(String[] args) {        
        
		boolean con=true;
		do{
		 /*��ʾ��¼�˵�*/
		Menu menu = new Menu();
		menu.showLoginMenu();
		
		/*ʵ�ֲ˵�*/
		Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
        	case 1:          
        		menu.showMainMenu();           
        		break;
        	case 2: 
        		System.out.println("лл����ʹ�ã�");
        		con=false;
        		break;
       }
	}while(con);
	}
}
