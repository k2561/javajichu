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
    * ��ʼ����Ʒ��Ϣ
    */
    public void initial(){
        int random = (int)(Math.random()*10);  //���������
        switch(random){
          case 0:
          case 1:
          case 2:
          case 3: 
        	  name = "�����綯��";
        	  price = 2000;
        	  break;
          case 4:
          case 5:
          case 6: 
        	  name = "34�紿ƽ�ʵ�";
        	  price = 3000;
        	  break;
          case 7:
          case 8:
          case 9:
        	  name = "�·ɱ���";
        	  price = 3400;
        	  break;
          default: 
        	  break;
        }  
    }   
    
    /**
     * �²�
     */
    public void guess(){
    	System.out.print("\n��²�\""+ name + "\"�ļ۸� " );
    	Scanner input = new Scanner(System.in);
    	double guessPrice = input.nextDouble();   //�Ӽ��̻�ȡ�û��µļ۸�;
    	boolean isCorrect = false;
    	for(int i = 0; i<3; i++){   //��������4��    		
    		if(guessPrice == price){   //�ж��Ƿ�¶ԣ���������ʾ��Ϣ
    			System.out.println("�¶��ˣ�");
    			isCorrect = true;
    			break;
    		}else if(guessPrice > price){
    			System.out.println("��С�㣡");
    		}else{
    			System.out.println("�ٴ�㣡");
    		}
    		System.out.print("\n�ٲ�һ�ΰɣ� ");
    		guessPrice = input.nextDouble(); 
    	}
    	if(!isCorrect){
    		System.out.println("\n4����û�в¶ԣ��´�Ŭ���ɣ�");
    	}
    }
}
