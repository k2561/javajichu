package cn.jbit.array;

import java.util.Arrays;

public class CharsSort {

	/**
	 * 字符逆序输出
	 */
	public static void main(String[] args) {
		char[] chars = new char[]{'a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		Arrays.sort(chars);		//对数组进行升序排序
		System.out.print("\n升序排序后：");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		System.out.print("\n逆序输出为：");
		for(int i = chars.length-1; i >= 0; i--){
			System.out.print(chars[i] + " ");
		}
	}
}
