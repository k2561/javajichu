package cn.jbit.classandobject;

import java.util.*;
/**
 * Menu1.java
 * @author xuejie.yu
 * @version 2.0 2010/06/01
 */
public class Menu {
	/**
	 * 显示登录菜单
	 */
	public void showLoginMenu(){
		System.out.println("\n\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t 1. 登 录 系 统\n");
		System.out.println("\t\t 2. 退 出\n");
		System.out.println ("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择,输入数字:");
     }
     
	/**
	 * 显示主菜单
	 */
     public void showMainMenu(){
    	System.out.println("\n\t我行我素购物管理系统主菜单\n");
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
 		System.out.println("\t\t 1. 客 户 信 息 管 理\n"); 		
 		System.out.println("\t\t 2. 真 情 回 馈\n"); 		
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
 		System.out.print("请选择,输入数字或按0返回上一级菜单:"); 		
 	    boolean con;
 	    do{ 
 	      con = false;
 		  /*输入数字，选择菜单*/
 		  Scanner input = new Scanner(System.in);  
 		  int no = input.nextInt();   
		  if (no == 1){  
			  showCustMMenu();		
		  }else if (no == 2){   
			  showSendGMenu();
		  }else if (no == 0){   
			  showLoginMenu();
 		  }else{
 			  System.out.print("输入错误, 请重新输入数字：");
 			  con = true;  
 		  }
 	    }while(con);   		
     }
     
     /**
      * 显示客户管理菜单
      */
     public void showCustMMenu(){
    	System.out.println("\n\t我行我素购物管理系统 > 客户信息管理");
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
 		System.out.println("\t\t  1. 显 示 所 有 客 户 信 息\n");
 		System.out.println("\t\t  2. 添 加 客 户 信 息\n");
 		System.out.println("\t\t  3. 修 改 客 户 信 息\n");
 		System.out.println("\t\t  4. 查 询 客 户 信 息\n");
 		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
 		System.out.print("请选择,输入数字或按0返回上一级菜单:");
 		
 		 /*输入数字，选择菜单*/
 		boolean con;
 		do{
 			con = false;
 			Scanner input = new Scanner(System.in);
 			int no = input.nextInt();
			if(no == 1){  
				System.out.println("执行显示所有客户信息");		
			}else if(no == 2){
				System.out.println("执行添加客户信息");
			}else if(no == 3){
				System.out.println("执行修改客户信息");
			}else if(no == 4){
				System.out.println("执行查询客户信息");
			}else if(no == 0){
				showMainMenu();// 返回主菜单
 			}else{
 				System.out.print("输入错误, 请重新输入数字：");
 				con = true;  
 			}		
 		}while(con); 		
     }
     /**
      * 显示真情回馈菜单
      */
     public void showSendGMenu(){
    	 System.out.println("\n\t我行我素购物管理系统 > 真情回馈");
		 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		 System.out.println("\t\t 1. 幸 运 大 放 送\n");
		 System.out.println("\t\t 2. 幸 运 抽 奖\n");
		 System.out.println("\t\t 3. 生 日 问 候\n");
		 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		 System.out.print("请选择,输入数字或按0返回上一级菜单：");		 
		 boolean con;
		 do{
			 con = false;
			 /*输入数字，选择菜单*/
			 Scanner input = new Scanner(System.in);
			 int no = input.nextInt(); 
			 if(no == 1){
					System.out.println("执行幸运大放送");		
			 }else if(no == 2){
					System.out.println("执行幸运抽奖");
			 }else if(no == 3){
					System.out.println("执行生日问候");
			 }else if(no == 0){
				 showMainMenu();  // 返回主菜单
			 }else{
					System.out.print("输入错误,请重新输入数字：");
					con = true;
			 }
		 }while(con);		
     }
} 

