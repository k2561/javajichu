package com.game.guess;
import java.util.Scanner;
/**
 * ��Ϸ��
 * �׶�4��ʵ��һ�ֶ�ս
 */
public class Game2 {
    Person person;       //�׷�
    Computer computer;   //�ҷ�
    int count;           //��ս����
	
    /**
     * ��ʼ��
     */
    public void initial(){
    	person = new Person();
    	computer = new Computer();
    	count = 0;
    }
		
    /**
     * ��ʼ��Ϸ
     */
	public void startGame() {
		initial();  // ��ʼ��
		System.out.println("----------------�� ӭ �� �� �� Ϸ �� ��----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println  ("\t\t**  ��ȭ, ��ʼ    **");
		System.out.println  ("\t\t******************");
		
		System.out.println("\n\n��ȭ����1.���� 2.ʯͷ 3.��");
		/*ѡ��Է���ɫ*/
		System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣��� ");
		Scanner input = new Scanner(System.in);
		int role = input.nextInt();
		if(role == 1){
			computer.name = "����";
		}else if(role == 2){
			computer.name = "��Ȩ";
		}else if(role == 3){
			computer.name = "�ܲ�";
		}    
		System.out.println("��ѡ���� "+computer.name+"��ս");
		
		/*��ʼ��Ϸ*/
		System.out.print("\nҪ��ʼ�𣿣�y/n�� ");
		String con = input.next();
		int perFist;   //�û�����ȭ
		int compFist;  //���������ȭ
		if(con.equals("y")){
	        /*��ȭ*/
			perFist = person.showFist();
			compFist = computer.showFist();
			/*�þ�*/
			if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
				System.out.println("���:�;�,��˥��\n");  //ƽ��
			}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
				System.out.println("����� ��ϲ�� ��Ӯ�ˣ�");  //�û�Ӯ				
			}else{
				System.out.println("���˵:^_^,�����ˣ��汿!\n");  //�����Ӯ				
			}			
		}		
	}
}
