package cn.jbit.loops2;

import java.util.Scanner;

public class BreakDemo {
	/**
	 * ѭ��¼��ѧ���ɼ������븺�����˳�
	 */
	  public static void main(String[] args) {
	       int score;    					//ÿ�ſεĳɼ�
	       int sum = 0;  					//�ɼ�֮��
	       int avg;      					//ƽ����
	       boolean isNegative = false;    	//�Ƿ�Ϊ����
	       Scanner input = new Scanner(System.in);
	       System.out.print("����ѧ������: ");
	       String name = input.next(); 	    //��������
	       for(int i = 0; i < 5; i++){ 	    //ѭ��5��¼��5�ſγɼ�  
	            System.out.print("�������" + (i+1) + "�ſεĳɼ��� ");
	            score = input.nextInt();
	            if(score < 0){			   //���븺��
	    		        isNegative = true;
	    		        break;
	    	       }
	            sum = sum + score;    	   //�ۼ����
	       }
	       if(isNegative){
	            System.out.println("��Ǹ������¼����������½���¼�룡");
	       }else{
	            avg = sum / 5;             //����ƽ����
	            System.out.println(name + "��ƽ�����ǣ�" + avg);
	       }
	  }
	}

