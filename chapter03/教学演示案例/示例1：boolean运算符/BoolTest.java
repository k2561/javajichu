package cn.jbit.ifdemo;
import java.util.Scanner;
public class BoolTest {
	public static void main(String[] args) {
		int liSi = 80;     //ѧԱ���ĳɼ�
  	  	boolean isBig ;    //����һ��boolean���͵ı���
  	  	Scanner input = new Scanner(System.in); 	//Java�����һ�ַ���
  	  	System.out.print("����ѧԱ�����ɼ�: "); 	//��ʾҪ����ѧԱ�����ĳɼ�
  	  	int zhangSan =  input.nextInt();  		//���������ĳɼ� 
  	  	isBig = zhangSan > liSi ;    //���ȽϽ��������boolean������
  	  	System.out.println( "�����ɼ������ĸ��� �� "+isBig );//����ȽϽ��
	}
}
