
import java.util.Scanner;
/**
 * �ж��Ƿ��ܱ�3��5����
 * @author ��������
 *
 */
public class Divide {	
	public static void main(String[] args) {
		int n;  
		Scanner input = new Scanner(System.in);
		System.out.println("������n7��ֵ��");
		n = input.nextInt();
		if(n%3==0||n%5==0){
			System.out.println("��������3��5�ı�����");
		}else{
			System.out.println("�������ܱ�3��5�е��κ�һ����������");
		}

	}

}
