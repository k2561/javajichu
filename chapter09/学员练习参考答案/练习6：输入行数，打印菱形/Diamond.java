package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ����������ӡ����
 */
public class Diamond {
	public static void main(String[] args) {
		int rows = 0;	//���ε�����
		Scanner input = new Scanner(System.in);
		System.out.print("����������������");
		rows = input.nextInt();

		while(rows%2 == 0){
			System.out.print("������������");
			rows = input.nextInt();
		}

		int n = (rows+1)/2;
		//��ӡ���ε��ϰ벿��
		for(int i = 1; i <= n; i++){//���ѭ������i��������
			for(int j = 1; j <= n-i; j++){//�ڲ�ѭ������j���Ƹ��пո���
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++){//�ڲ�ѭ������k���Ƹ���*����
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//��ӡ���ε��°벿��
		for(int i = n-1; i >= 1; i--){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
