package cn.jbit.classandobject;

import java.util.Scanner;
public class StartSMS {

	/**
	 * �������
	 */
	public static void main(String[] args) {
		/*��ʼ��ϵͳ����Ա*/
		Manager manager = new Manager(); 
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
	        		/*������֤*/
	                System.out.print("�������û�����");
	         	   String name = input.next();
	                System.out.print("���������룺");
	                String psw = input.next();
	                if(name.equals(manager.username)&& psw.equals(manager.password)){
	                	System.out.println("@@��¼�ɹ���"+manager.username+"@@");
	                	menu.showMainMenu();
	                }else{
	                 	System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��@@");	                 	
	                }
	          	   break;
	        	case 2: 
	        		System.out.println("лл����ʹ�ã�");
	        		con=false;
	        		break;
	       }
		}while(con);		
	}
}
