package cn.jbit.array;

import java.util.Arrays;

public class CharsSort {

	/**
	 * �ַ��������
	 */
	public static void main(String[] args) {
		char[] chars = new char[]{'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		Arrays.sort(chars);		//�����������������
		System.out.print("\n���������");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		System.out.print("\n�������Ϊ��");
		for(int i = chars.length-1; i >= 0; i--){
			System.out.print(chars[i] + " ");
		}
	}
}
