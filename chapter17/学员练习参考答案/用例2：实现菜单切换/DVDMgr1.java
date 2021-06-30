package com.jb.minidvd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DVDMgr1 {
	/**
	 * 创建DVD对象
	 */
	DVDSet1 dvd = new DVDSet1();
	/**
	 * 初始三个DVD	 
	 */
    public void initial() {
    	
    	dvd.name[0] = "罗马假日";
    	dvd.state[0] = 0; 
    	dvd.date[0]="2010-7-1";
    	
    	dvd.name[1] = "风声鹤唳";
    	dvd.state[1] = 1;    	
    	dvd.name[2] = "浪漫满屋";
    	dvd.state[2] = 1;
    }	
	/**
	 * 开始菜单
	 */
	public void startMenu(){
		 System.out.println("欢 迎 使 用 迷 你 DVD 管 理 器");
	   	 System.out.println("-------------------------------------");
	   	 System.out.println("1. 新 增 DVD");
	   	 System.out.println("2. 查 看 DVD");
	   	 System.out.println("3. 删 除 DVD");
	   	 System.out.println("4. 借 出 DVD");
	     System.out.println("5. 归 还 DVD");
	   	 System.out.println("6. 退         出 ");
	   	 System.out.print("--------------------------------------\n");
	
	   	 System.out.print("请选择： ");
	   	 Scanner input = new Scanner(System.in);
	   	 int choice = input.nextInt();
	   	 switch(choice){
	   	    case 1:
	   	    	System.out.println("此处实现新增DVD ");//add();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 2: 
	   	    	System.out.println("此处实现查看DVD ");//search();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 3:
	   	    	System.out.println("此处实现删除DVD ");//delete();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 4:
	   	    	System.out.println("此处实现借出DVD ");//lend();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 5:
	   	    	System.out.println("此处实现归还DVD ");//returnDvd();
	   	    	System.out.println("**************************");
	   	    	returnMain();
	   	    	break;
	   	    case 6:
	   	    	System.out.println("\n谢谢 使 用！");
	   	    	break;
	   	 }
    }
	/**
     * 返回主菜单
     */
    public void returnMain(){
   	 Scanner input = new Scanner(System.in); 
   	 System.out.print("输入0返回：");
        if(input.nextInt() == 0){
       	 startMenu();
        }else{
       	 System.out.println("输入错误, 异常终止！");
        }
    }
   
}
