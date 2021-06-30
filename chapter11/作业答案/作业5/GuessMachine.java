package cn.jbit.classandobject;
import java.util.*;
/**
 * GuessMachine.java
 * 
 */
public class GuessMachine {
   String name ;
   double price;
	
   /**
    * 初始化商品信息
    */
    public void initial(){
        int random = (int)(Math.random()*10);  //产生随机数
        switch(random){
          case 0:
          case 1:
          case 2:
          case 3: 
        	  name = "公主电动车";
        	  price = 2000;
        	  break;
          case 4:
          case 5:
          case 6: 
        	  name = "34寸纯平彩电";
        	  price = 3000;
        	  break;
          case 7:
          case 8:
          case 9:
        	  name = "新飞冰箱";
        	  price = 3400;
        	  break;
          default: 
        	  break;
        }  
    }   
    
    /**
     * 猜测
     */
    public void guess(){
    	System.out.print("\n请猜测\""+ name + "\"的价格： " );
    	Scanner input = new Scanner(System.in);
    	double guessPrice = input.nextDouble();   //从键盘获取用户猜的价格;
    	boolean isCorrect = false;
    	for(int i = 0; i<3; i++){   //允许最多猜4次    		
    		if(guessPrice == price){   //判断是否猜对，并给出提示信息
    			System.out.println("猜对了！");
    			isCorrect = true;
    			break;
    		}else if(guessPrice > price){
    			System.out.println("再小点！");
    		}else{
    			System.out.println("再大点！");
    		}
    		System.out.print("\n再猜一次吧： ");
    		guessPrice = input.nextDouble(); 
    	}
    	if(!isCorrect){
    		System.out.println("\n4次内没有猜对，下次努力吧！");
    	}
    }
}
