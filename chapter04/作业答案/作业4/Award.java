
import java.util.Scanner;

public class Award {
	public static void main(String[] args) {
		System.out.print("���Գɼ��ǣ� ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt(); // ���Գɼ�
		if(score>100 || score<0){
			System.out.println("������1--100֮��");
		}else{
			switch (score / 10) {
			case 10:
				System.out.println("���׸���������");
				break;
			case 9:
				System.out.println("ĸ�׸�����̨�ʼǱ�����");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("ĸ�׸������ֻ�");
				break;
			default:
				System.out.println("û������");
			}

		}
	
	}

}

