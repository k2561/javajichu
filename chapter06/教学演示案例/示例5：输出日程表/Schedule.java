package cn.jbit.loops2;
import java.util.*;
public class Schedule {
	/**
	 * break��switch�е����ã�����ѡ�������ճ̰���
	 */
     public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
		      System.out.print("�鿴�ճ̱����������ڣ�1-5����");
		      int day = input.nextInt();
		      switch (day) {
		      case 1:
			      System.out.println("��ϯIT�Ƽ�չ������ʽ");
			      break;
		      case 2:
			      System.out.println("�ɵ���۲μ���̫������");
			      break;
		      case 3:
			      System.out.println("�����������ۺ���԰");
			      break;
		      case 4:
			      System.out.println("�־��ٿ���˾�¶ȹɶ����");
			      break;
		      case 5:
			      System.out.println("����ʱ��");
			      break;
		      }
	     }
}

