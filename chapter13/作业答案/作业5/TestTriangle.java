import java.util.Scanner;


public class TestTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle t=new Triangle();
		boolean con=true;
		while(con){
			Scanner input = new Scanner(System.in);
			System.out .print("�������һ���ߣ�");
			int num1=input.nextInt();
			System.out .print("������ڶ����ߣ�");
			int num2=input.nextInt();
			System.out .print("������������ߣ�");
			int num3=input.nextInt();
			if(t.isTriangle(num1,num2,num3)){
				System.out .print("����һ��"+t.Shape(num1, num2, num3));
			}else{
				System.out .print("�ⲻ�ܹ��������Ρ�");
			}
			System.out .print("\n�����𣿣�y/n��:");
			String choice=input.next();
			if(choice.equals("n")){
				con=false;
				System.out .print("ллʹ�ã�");
			}
		}
	}

}
