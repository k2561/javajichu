import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�յ�ѹ��Ǯ����Ŀ��");
		double money = input.nextDouble();
		if(money >= 1000){
			System.out.println("����ʧѧ��ͯ");
		}else if(money >= 500){
			System.out.println("����ģ");
		}else{
			System.out.println("����ٿ�ȫ��");
		}
	}
}
