package cn.jbit.classandobject;
import java.util.*;
public class TestTriangle {	
	public static void main(String[] args) {
		Triangle tr=new Triangle();
		Scanner input = new Scanner(System.in);
		System.out .print("�������иߣ�");
		int r = input.nextInt();
		System.out .print("�������ӡ���ַ���");
		String str = input.next();
		tr.printTriangle(r,str);
	}
}
