import java.util.Scanner;

/**
 * ���쳲��������е�ǰ10����
 * @author ��������
 *
 */
public class Test1 {

	public static void main(String[] args) {
		//����num1��num2��num3��������������������������������
		int num1= 1;
		int num2 =1;
		int num3;
		int i=3;
		//������е�ǰ������
		System.out.println(num1);
		System.out.println(num2);
		//������еĵ�����������ʮ����
		while(i<=10){
			num3 = num1 + num2; //�����i����
			System.out.println(num3);//�����i����
			num1=num2; 
			num2=num3;
			i++;
			
		}

	}

}
