import java.util.*;

public class Encryption {

	public String encrypt(int psw) {
		int[] s = new int[6];
		for (int i = 5; i >= 0; i--) { // ���
			s[i] = psw % 10;
			psw = psw / 10;
		}

		int[] temp;
		for (int i = 0; i < 3; i++) { // ѭ��ִ�н���
			s = doChange(i, s);
		}

		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < 6; i++) { // ����
			sb.append(s[i]);
		}
		return sb.toString();

	}

	public int[] doChange(int i, int[] s) {
		int temp;
		temp = s[i];
		s[i] = s[5 - i];
		s[5 - i] = temp;
		return s;
	}

	public static void main(String[] args) {
		Encryption e = new Encryption();
		System.out.print("������һ��6λ�绰���룺 ");
		Scanner input = new Scanner(System.in);
		int psw = input.nextInt();
		System.out.println("\n����������ǣ�" + e.encrypt(psw));

	}
}
