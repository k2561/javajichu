package cn.jbit.array;

import java.util.Scanner;

public class InvertOutput {

	/**
	 * 逆序输出5句话
	 */
	public static void main(String[] args) {
		String[] strings = new String[5];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5句话");
		for(int i = 0; i < strings.length; i++){
			System.out.print("第" +(i+1)+ "句话：");
			strings[i] = input.next();
		}
		System.out.println("\n逆序输出5句话为：");
		for(int i = strings.length-1; i >= 0 ; i--){
			System.out.println(strings[i]);
		}
	}
}
