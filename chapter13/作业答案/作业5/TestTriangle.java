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
			System.out .print("请输入第一条边：");
			int num1=input.nextInt();
			System.out .print("请输入第二条边：");
			int num2=input.nextInt();
			System.out .print("请输入第三条边：");
			int num3=input.nextInt();
			if(t.isTriangle(num1,num2,num3)){
				System.out .print("这是一个"+t.Shape(num1, num2, num3));
			}else{
				System.out .print("这不能构成三角形。");
			}
			System.out .print("\n继续吗？（y/n）:");
			String choice=input.next();
			if(choice.equals("n")){
				con=false;
				System.out .print("谢谢使用！");
			}
		}
	}

}
