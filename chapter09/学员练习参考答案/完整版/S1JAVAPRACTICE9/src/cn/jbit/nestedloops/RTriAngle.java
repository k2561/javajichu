package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ����������ӡֱ��������
 */
public class RTriAngle {
	public static void main(String[] args) {
		int rows = 0;	//����������
		System.out.print("������ֱ�������ε�������");
		Scanner input = new Scanner(System.in);
		rows = input.nextInt();
		
		//��ӡֱ��������
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= 2*i-1; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
