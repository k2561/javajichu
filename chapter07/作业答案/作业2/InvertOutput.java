package cn.jbit.array;

import java.util.Scanner;

public class InvertOutput {

	/**
	 * �������5�仰
	 */
	public static void main(String[] args) {
		String[] strings = new String[5];
		Scanner input = new Scanner(System.in);
		System.out.println("������5�仰");
		for(int i = 0; i < strings.length; i++){
			System.out.print("��" +(i+1)+ "�仰��");
			strings[i] = input.next();
		}
		System.out.println("\n�������5�仰Ϊ��");
		for(int i = strings.length-1; i >= 0 ; i--){
			System.out.println(strings[i]);
		}
	}
}
