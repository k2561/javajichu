package com.game.guess;

/**
 * �������
 * �׶�2���
 */
public class Computer {
       String name = "����"; // ����
       int score = 0;;       // ����
       
       /**
        * ��ȭ
        * @return ��ȭ�����1.���� 2.ʯͷ 3.��
        */
       public int showFist(){
    	   // ���������
    	   int show = (int)(Math.random()*10)%3 + 1;  //�������������ʾ���Գ�ȭ
    	   
    	   // �����ȭ���������
    	   switch(show){
    	      case 1:
    	    	  System.out.println(name+"��ȭ: ����");
    	    	  break;
    	      case 2:
    	    	  System.out.println(name+"��ȭ: ʯͷ");
    	    	  break;
    	      case 3: 
    	    	  System.out.println(name+"��ȭ: ��");
    	    	  break;
    	   }
    	   return show;
       }
}
