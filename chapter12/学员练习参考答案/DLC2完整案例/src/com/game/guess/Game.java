package com.game.guess;
import java.util.Scanner;

/**
 * ��Ϸ����ȫ��
 * �׶�7��������չ
 */
public class Game {
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
		
		System.out.println("----------------�� ӭ �� �� �� Ϸ �� ��----------------");
		System.out.println("\n\t\t******************");
		System.out.println  ("\t\t**  ��ȭ, ��ʼ    **");
		System.out.println  ("\t\t******************");
		
		System.out.println("\n��ȭ����1.���� 2.ʯͷ 3.��");
		
		Scanner input = new Scanner(System.in);
		String exit = "n";  // �˳�ϵͳ
		
		do{
			initial();  // ��ʼ��
			/*ѡ��Է���ɫ*/
			System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣��� ");
			
			int role = input.nextInt();
			if(role == 1){
				computer.name = "����";
			}else if(role == 2){
				computer.name = "��Ȩ";
			}else if(role == 3){
				computer.name = "�ܲ�";
			}   
			
			// ��չ����1�������û�����
			/*�����û�����*/
			System.out.print("���������������");
			person.name = input.next();
			
			System.out.println(person.name+"  VS  "+computer.name+"  ��ս\n");
			// ��չ����1����
			
			System.out.print("Ҫ��ʼ�𣿣�y/n�� ");
			String start = input.next();  // ��ʼÿһ����Ϸ
			
			
			int perFist;   //�û�����ȭ
			int compFist;  //���������ȭ
			
			while(start.equals("y")){
		        /*��ȭ*/
				perFist = person.showFist();
				compFist = computer.showFist();
				/*�þ�*/
				if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
					System.out.println("���:�;�,��˥���ٺ�,�����ư� !\n");  //ƽ��
				}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
					System.out.println("����� ��ϲ�� ��Ӯ�ˣ�");  //�û�Ӯ
					person.score++;
				}else{
					System.out.println("���˵:^_^,�����ˣ��汿!\n");  //�����Ӯ
					computer.score++;
				}
				count++;
				System.out.print("\n�Ƿ�ʼ��һ�֣�y/n��:  ");
				start = input.next();	
			}
			/*��ʾ���*/
			showResult();			
			
			// ��չ����3��ѭ����Ϸ��ֱ���˳�ϵͳ
			System.out.print("\nҪ��ʼ��һ����(y/n)��");
			exit = input.next();			
			System.out.println();
			// ��չ����3����
		}while(!exit.equals("n"));	
		
		System.out.println("ϵͳ�˳���");
	}
	
	/**
	 * ��ʾ�������
	 */
	public void showResult(){
		/*��ʾ��ս����*/
		System.out.println("---------------------------------------------------");
		System.out.println(computer.name + "  VS  " + person.name);
		System.out.println("��ս������"+ count);
		
		// ��չ����2����ʾ���յĵ÷�
		System.out.println("\n����\t�÷�");		
		System.out.println(person.name+"\t"+person.score);
		System.out.println(computer.name+"\t"+computer.score+"\n");
		// ��չ����2����
		
		/*��ʾ��ս���*/
		int result = calcResult();
		if(result == 1){
			System.out.println("��������ƽ�֣��´��ٺ���һ�ָ��£�");
		}else if(result == 2){
			System.out.println("�������ϲ��ϲ��");   //�û���ʤ
		}else{ 
			System.out.println("������Ǻǣ��������´μ��Ͱ���");   //�������ʤ
		}
		System.out.println("---------------------------------------------------");
	}
	
	/**
	 * ����������
	 * @return 1:սƽ��2:�û�Ӯ��3:����Ӯ
	 */
    public int calcResult(){
    	if(person.score == computer.score){
    		  return 1; // սƽ
    	}else if(person.score > computer.score){
    		  return 2; // �û�Ӯ
    	}else{
    		  return 3; // ����Ӯ
    	}
    	
    }
}
