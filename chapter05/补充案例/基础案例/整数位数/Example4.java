import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("����������һ��������");
		 int num = input.nextInt();
		 int count = 0;
		 do{
			 num = num / 10;  //��ȡλ��
			 count++;
		 }while(num > 0);
		 System.out.println(count + "λ");
		 

	}

}
