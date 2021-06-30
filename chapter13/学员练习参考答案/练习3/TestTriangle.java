package cn.jbit.classandobject;
import java.util.*;
public class TestTriangle {	
	public static void main(String[] args) {
		Triangle tr=new Triangle();
		Scanner input = new Scanner(System.in);
		System.out .print("请输入行高：");
		int r = input.nextInt();
		System.out .print("请输入打印的字符：");
		String str = input.next();
		tr.printTriangle(r,str);
	}
}
