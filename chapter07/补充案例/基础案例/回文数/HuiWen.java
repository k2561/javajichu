
import java.util.*;
public class Huiwen {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��4λ���֣� ");
		int num = input.nextInt();
		int i;
		int temp = num;
		for(i = 0; i < 5; i++){   //�ֽ�
			a[i] = temp % 10;
			temp = temp / 10;
		}
		boolean isCorrect = true;  
		for(i = 0; i < 5; i++){
			if(!(a[i] == a[4-i])){   //��һ�Բ���ͬ���ǻ���
			    isCorrect = false;
			    break;
			}
		}
		if(isCorrect){
			System.out.println(num + "�ǻ��ģ�");
		}else{
			System.out.println(num + "���ǻ��ģ�");
		}
	}

}
