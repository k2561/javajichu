import java.util.*;

/**
 * �ܽ᣺�ֳ����1
 */
public class ScoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt(); // ���ճɼ�
		if (score == 100) {
			System.out.println("���ְָ���������");
		} else if (score >= 90) {
			System.out.println("�����������MP4");
		} else if (score < 90 && score >= 60) {
			System.out.println("����������򱾲ο���");
		} else {
			System.out.println("ʲô������");
		}
	}

}
