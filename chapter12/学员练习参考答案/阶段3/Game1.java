package com.game.guess;
import java.util.Scanner;

/**
 * ��Ϸ��
 */
public class Game1 {
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
		initial();
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
		
		System.out.print("��ѡ����"+computer.name+"��ս");
	}
}
