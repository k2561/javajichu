package cn.jbit.loops1;

import java.util.Scanner;

public class Weekdays {

	/**
	 * ��������������ʾ��Ӧ��Ӣ������������д
	 */
	public static void main(String[] args) {
		int num = 0;
		String day = "";
		System.out.print("����������1-7(����0����)��");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		while(num != 0){
			if(num >= 1 && num <= 7){	//���ֺϷ�
				switch(num){
				case 1:
					day = "MON";
					break;
				case 2:
					day = "TUE";
					break;
				case 3:
					day = "WED";
					break;
				case 4:
					day = "THU";
					break;
				case 5:
					day = "FRI";
					break;
				case 6:
					day = "SAT";
					break;
				case 7:
					day = "SUN";
					break;
				}
				System.out.println("������  " + day);
				System.out.print("����������1-7(����0����)��");
				num = input.nextInt();
			}else{	//���ַǷ�
				System.out.print("��������ַǷ������������룺");
				num = input.nextInt();
			}
		}
		System.out.println("���������");
	}

}
