package cn.jbit.ifdemo;
import java.util.Scanner;

public class GetPrize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("�����źƵ�Java�ɼ�: "); //��ʾҪ����Java�ɼ�
        int score =  input.nextInt(); 	//�ӿ���̨��ȡ������Java�ɼ�
        if ( score > 90 ) {    			//�ж��Ƿ����90��
             System.out.println("��ʦ˵:��������һ��MP4��");
        }
	}
}
