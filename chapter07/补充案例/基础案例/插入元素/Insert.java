import java.util.*;

public class Insert {

	public static void main(String[] args) {
		int[] list = new int[6]; // ����ΪΪ6������
		list[0] = 85;
		list[1] = 63;
		list[2] = 49;
		list[3] = 22;
		list[4] = 10;

		System.out.print("������Ҫ��������ݣ� ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // ����Ҫ���������
		int i;
		for (i = 0; i < list.length; i++) { // ����Ҫ����λ�õ�Ԫ���±�
			if (num > list[i]) {
				break;
			}
		}

		for (int j = list.length - 1; j > i; j--) { // ΪҪ�����������λ��
			list[j] = list[j - 1];
		}

		list[i] = num;
		System.out.print("����������Ԫ���ǣ� ");
		for (i = 0; i < list.length; i++) { // ѭ�����Ŀǰ�����е�����
			System.out.print(list[i] + "\t");
		}

	}

}
