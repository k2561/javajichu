package com.game.guess;
import java.util.Scanner;
/**
 * �û���
 * �׶�1���
 */
public class Person { 
      String name = "����";  // ����
      int score = 0;         // ����  
      
      /**
       * ��ȭ
       * @return ��ȭ�����1.���� 2.ʯͷ 3.��
       */
      public int showFist(){
    	  // �����û���ѡ��
    	  Scanner input = new Scanner(System.in);
    	  System.out.print("\n���ȭ:1.���� 2.ʯͷ 3.�� (������Ӧ����) :");
    	  int show = input.nextInt();
    	  
    	  // �����ȭ�����������
    	  switch(show){
    	      case 1: 
    	    	  System.out.println("���ȭ: ����");
    	    	  break;
    	      case 2:
    	    	  System.out.println("���ȭ: ʯͷ");
    	    	  break;
    	      case 3: 
    	    	  System.out.println("���ȭ: ��");
    	    	  break;
    	  }
    	  return show;
      }
}
