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
	   	    	add();	   	    	
	   	    	break;
	   	    case 2: 
	   	    	search();	   	    	
	   	    	break;
	   	    case 3:
	   	    	delete();	   	    	
	   	    	break;
	   	    case 4:
	   	    	lend();	   	    	
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
    /**
     * �鿴DVD
     */
    public void search(){
    	System.out.println("---> �鿴DVD\n");
    	System.out.println("���\t״ ̬\t����\t\t�������");
    	for(int i = 0 ; i < dvd.name.length; i++){
   		    if(dvd.name[i]==null){
   			    break;
   		    }else if(dvd.state[i] == 0){
   			    System.out.println((i+1)+"\t�ѽ��\t"+"<<"+ dvd.name[i]+ ">>\t" + dvd.date[i]);
   		    }else if(dvd.state[i] == 1){
   			    System.out.println((i+1)+"\t�� ��\t"+"<<"+dvd.name[i]+">>");
   		    }
   	    }
    	System.out.println("**************************");
    	returnMain(); 	 
    }
    /**
     * ����DVD
     */
    public void add(){
     Scanner input = new Scanner(System.in);
   	 System.out.println("---> ����DVD\n");    	
   	 System.out.print("������DVD���ƣ� ");
   	 String name = input.next();  
   	 for(int i = 0; i < dvd.name.length; i++){   		 
   		 if(dvd.name[i] == null){    //��ѯ���һ����λ�ò���
   			dvd.name[i]=name;
   			dvd.state[i]=1;//��������DVD�ɽ�״̬
   			 System.out.println("������"+name+"���ɹ���");
   			 break;
   		 }
   	 }
   	 System.out.println("**************************");
   	 returnMain();   
    } 
    /**
     * ɾ��DVD
     */
    public void delete(){
    	Scanner input = new Scanner(System.in);
    	boolean flag=false;//��ʶɾ���ɹ����
    	System.out.println("---> ɾ��DVD\n");
    	System.out.print("������DVD���ƣ� ");
      	String name = input.next();  
      	//�������飬����ƥ����Ϣ
      	for(int i = 0 ; i < dvd.name.length; i++){
      		//���ҵ���ÿ��Ԫ��ǰ��һλ
      		if(dvd.name[i]!=null &&dvd.name[i].equalsIgnoreCase(name)&&dvd.state[i]==1){
      			int j=i;
      			while(dvd.name[j+1]!=null){
      				dvd.name[j]=dvd.name[j+1];
      				dvd.state[j]=dvd.state[j+1];
      				dvd.date[j]=dvd.date[j+1];
      				j++;
      			}
      			//���һ����Ϊ�յ�Ԫ���ÿ�
   				dvd.name[j]=null;   				
   				dvd.date[j]=null; 
   			 System.out.println("ɾ����"+name+"���ɹ���");
   			 flag=true;//��λ����ʾɾ���ɹ�
   			 break;
      		}else if(dvd.name[i]!=null &&dvd.name[i].equalsIgnoreCase(name)&&dvd.state[i]==0){
      			System.out.println("��"+name+"��Ϊ���״̬������ɾ����"); 
      			flag=true;//��λ
      			break;
      		}
      	}
      	if(!flag){
      		System.out.println("û���ҵ�ƥ����Ϣ��");
      	}
      	System.out.println("**************************");
      	returnMain(); 	 
    }
    /**
     * ���DVD
     */
    public void lend(){
   	 System.out.println("---> ���DVD\n");
   	 
   	 Scanner input = new Scanner(System.in);
   	 System.out.print("������DVD���ƣ� ");
   	 String want = input.next();  //Ҫ�����DVD���� 
   	 for(int i = 0; i < dvd.name.length; i++){   		 
   		 if(dvd.name[i] == null){    //��ƥ��
   			 System.out.println("û���ҵ�ƥ����Ϣ��");
   			 break;
   		 }else if(dvd.name[i].equals(want)&& dvd.state[i]==1){  //�ҵ�ƥ��ɽ�	 
   			 dvd.state[i] = 0;
   			 System.out.print("�����������ڣ���-��-�գ���");
   			 dvd.date[i]=input.next();
   			 System.out.println("�����"+want+"���ɹ�!");
   			 break;
   		 }else if(dvd.name[i].equals(want)&& dvd.state[i]==0){  //�ҵ�ƥ���ѱ���� 			
   			 System.out.println("��"+want+"���ѱ������");
   			 break;
   		 }   		 
   	 }
   	 System.out.println("**************************");
   	 returnMain();
    }
}
