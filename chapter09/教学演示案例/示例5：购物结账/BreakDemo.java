package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * break�ϵ���ʾ��ʵ�ֹ������
 */
public class BreakDemo {
	public static void main(String[] args) {
		int count = 0;    //��¼һ�����˼����·�
		String choice;    //�˿�ѡ���Ƿ��뿪
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("��ӭ���ٵ�" + (i+1) + "��ר����");
			for(int j = 0; j < 3; j++){
				System.out.print("Ҫ�뿪��y/n����");
				choice = input.nextLine();
				if("y".equals(choice)){    //����뿪����������������һ�ҵ�
					break;	
				}
				System.out.println("����һ���·�");
				count++;
			}
			System.out.println("������\n");
		}
		System.out.println("�ܹ�����" + count + "���·�");
		choice = input.nextLine();
	}
}
