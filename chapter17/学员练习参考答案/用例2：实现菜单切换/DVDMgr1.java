package com.jb.minidvd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DVDMgr1 {
	/**
	 * ����DVD����
	 */
	DVDSet1 dvd = new DVDSet1();
	/**
	 * ��ʼ����DVD	 
	 */
    public void initial() {
    	
    	dvd.name[0] = "�������";
    	dvd.state[0] = 0; 
    	dvd.date[0]="2010-7-1";
    	
    	dvd.name[1] = "�������";
    	dvd.state[1] = 1;    	
    	dvd.name[2] = "��������";
    	dvd.state[2] = 1;
    }	
	/**
	 * ��ʼ�˵�
	 */
	public void startMenu(){
		 System.out.println("�� ӭ ʹ �� �� �� DVD �� �� ��");
	   	 System.out.println("-------------------------------------");
	   	 System.out.println("1. �� �� DVD");
	   	 System.out.println("2. �� �� DVD");
	   	 System.out.println("3. ɾ �� DVD");
	   	 System.out.println("4. �� �� DVD");
	     System.out.println("5. �� �� DVD");
	   	 System.out.println("6. ��         �� ");
	   	 System.out.print("--------------------------------------\n");
	
	   	 System.out.print("��ѡ�� ");
	   	 Scanner input = new Scanner(System.in);
	   	 int choice = input.nextInt();
	   	 switch(choice){
	   	    case 1:
	   	    	System.out.println("�˴�ʵ������DVD ");//add();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 2: 
	   	    	System.out.println("�˴�ʵ�ֲ鿴DVD ");//search();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 3:
	   	    	System.out.println("�˴�ʵ��ɾ��DVD ");//delete();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 4:
	   	    	System.out.println("�˴�ʵ�ֽ��DVD ");//lend();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 5:
	   	    	System.out.println("�˴�ʵ�ֹ黹DVD ");//returnDvd();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 6:
	   	    	System.out.println("\nлл ʹ �ã�");
	   	    	break;
	   	 }
    }
	/**
     * �������˵�
     */
    public void returnMain(){
   	 Scanner input = new Scanner(System.in); 
   	 System.out.print("����0���أ�");
        if(input.nextInt() == 0){
       	 startMenu();
        }else{
       	 System.out.println("�������, �쳣��ֹ��");
        }
    }
   
}
