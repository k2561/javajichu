
import java.util.*;
public class Encrypt {

	public static void main(String[] args) {
		int[] a = new int[4];
		int temp;    //��ʱ����,����������
		int i;
		Scanner input =new Scanner(System.in);
		System.out.print("������һ��4λ���֣� ");
		int num = input.nextInt();
		int t = num;
		for(i = 0; i < 4; i++){   //�ֽ�
			a[i] = t % 10;
			t = t / 10;
		}
		for(i = 0; i < 4; i++){
			a[i] = a[i] + 5;
			a[i] = a[i] % 10;
		}
		for(i = 0; i <=1; i++){   //����
			temp = a[i];
			a[i] = a[3-i];
			a[3-i] = temp;
		}
		System.out.print("���ܺ��4λ�����ǣ�");
		for(i = 3; i >= 0; i--){   //���
			System.out.print(a[i]);
		}
	}
}
