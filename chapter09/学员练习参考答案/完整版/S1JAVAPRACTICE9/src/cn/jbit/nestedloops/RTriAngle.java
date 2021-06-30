package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * 输入行数打印直角三角形
 */
public class RTriAngle {
	public static void main(String[] args) {
		int rows = 0;	//三角形行数
		System.out.print("请输入直角三角形的行数：");
		Scanner input = new Scanner(System.in);
		rows = input.nextInt();
		
		//打印直角三角形
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= 2*i-1; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
