import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("请输入任意一个整数：");
		 int num = input.nextInt();
		 int count = 0;
		 do{
			 num = num / 10;  //提取位数
			 count++;
		 }while(num > 0);
		 System.out.println(count + "位");
		 

	}

}
