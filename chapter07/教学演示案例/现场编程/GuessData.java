package s1java.sg.chap8;

/**
 * С��2:�ֳ����3
 */
import java.util.*;

public class GuessData {

	public static void main(String[] args) {
		int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // �������鲢��ֵ

		Scanner input = new Scanner(System.in);
		System.out.print("������һ�������� ");
		int guess = input.nextInt();
		boolean isCorrect = false;
		for (int i = 0; i < list.length; i++) {
			if (guess == list[i]) {
				isCorrect = true;
				break;
			}
		}
		if (isCorrect) {
			System.out.println("�¶��ˣ�");
		} else {
			System.out.println("Sorry��");
		}
	}

}
