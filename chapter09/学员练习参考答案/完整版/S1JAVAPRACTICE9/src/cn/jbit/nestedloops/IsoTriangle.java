package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ����������ӡ����������
 */
public class IsoTriangle {
	public static void main(String[] args) {
		int rows = 0;	//����������
		System.out.print("��������������ε�������");
		Scanner input = new Scanner(System.in);
		rows = input.nextInt();
		//��ӡ����������
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= rows-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
