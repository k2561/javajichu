package cn.jbit.classandobject;

import java.util.*;
/**
 * Menu1.java
 */
public class Menu {
	/**
	 * ��ʾ��¼�˵�
	 */
	public void showLoginMenu(){
		System.out.println("\n\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t 1. �� ¼ ϵ ͳ\n");
		System.out.println("\t\t 2. �� ��\n");
		System.out.println ("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ��,��������:");
     }
     
	/**
	 * ��ʾ���˵�
	 */
     public void showMainMenu(){
    	System.out.println("\n\t�������ع������ϵͳ���˵�\n");
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
 		System.out.println("\t\t 1. �� �� �� Ϣ �� ��\n"); 		
 		System.out.println("\t\t 2. �� �� �� ��\n"); 		
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
 		System.out.print("��ѡ��,�������ֻ�0������һ���˵�:"); 		
 	    boolean con;
 	    do{ 
 	      con = false;
 		  /*�������֣�ѡ��˵�*/
 		  Scanner input = new Scanner(System.in);  
 		  int no = input.nextInt();   
		  if (no == 1){  
			  showCustMMenu();		
		  }else if (no == 2){   
			  showSendGMenu();
		  }else if (no == 0){   
			  showLoginMenu();
 		  }else{
 			  System.out.print("�������, �������������֣�");
 			  con = true;  
 		  }
 	    }while(con);   		
     }
     
     /**
      * ��ʾ�ͻ�����˵�
      */
     public void showCustMMenu(){
    	System.out.println("\n\t�������ع������ϵͳ > �ͻ���Ϣ����");
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
 		System.out.println("\t\t  1. �� ʾ �� �� �� �� �� Ϣ\n");
 		System.out.println("\t\t  2. �� �� �� �� �� Ϣ\n");
 		System.out.println("\t\t  3. �� �� �� �� �� Ϣ\n");
 		System.out.println("\t\t  4. �� ѯ �� �� �� Ϣ\n");
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
 		System.out.print("��ѡ��,�������ֻ�0������һ���˵�:");
 		
 		 /*�������֣�ѡ��˵�*/
 		boolean con;
 		do{
 			con = false;
 			Scanner input = new Scanner(System.in);
 			int no = input.nextInt();
			if(no == 1){  
				System.out.println("ִ����ʾ���пͻ���Ϣ");		
			}else if(no == 2){
				System.out.println("ִ����ӿͻ���Ϣ");
			}else if(no == 3){
				System.out.println("ִ���޸Ŀͻ���Ϣ");
			}else if(no == 4){
				System.out.println("ִ�в�ѯ�ͻ���Ϣ");
			}else if(no == 0){
				showMainMenu();// �������˵�
 			}else{
 				System.out.print("�������, �������������֣�");
 				con = true;  
 			}		
 		}while(con); 		
     }
     /**
      * ��ʾ��������˵�
      */
     public void showSendGMenu(){
    	 System.out.println("\n\t�������ع������ϵͳ > �������");
		 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		 System.out.println("\t\t 1. �� �� �� �� ��\n");
		 System.out.println("\t\t 2. �� �� �� ��\n");
		 System.out.println("\t\t 3. �� �� �� ��\n");
		 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		 System.out.print("��ѡ��,�������ֻ�0������һ���˵���");		 
		 boolean con;
		 do{
			 con = false;
			 /*�������֣�ѡ��˵�*/
			 Scanner input = new Scanner(System.in);
			 int no = input.nextInt(); 
			 if(no == 1){
					System.out.println("ִ�����˴����");		
			 }else if(no == 2){
					System.out.println("ִ�����˳齱");
			 }else if(no == 3){
					System.out.println("ִ�������ʺ�");
			 }else if(no == 0){
				 showMainMenu();  // �������˵�
			 }else{
					System.out.print("�������,�������������֣�");
					con = true;
			 }
		 }while(con);		
     }
} 

