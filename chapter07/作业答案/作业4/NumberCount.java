package cn.jbit.array;

import java.util.Scanner;

public class NumberCount {

	/**
	 * 统计合法数字（1，2，3）和非法数字的个数
	 */
	public static void main(String[] args) {
		int[] num = new int[10];	//数字数组
		int[] count = new int[4];	//统计每个数出现的个数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个数");
		for(int i = 0; i < num.length; i++){
			num[i] = input.nextInt();
			switch(num[i]){
			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			default:
				count[3]++;
				break;
			}
		}
		System.out.println("数字 1 的个数：" + count[0]);
		System.out.println("数字 2 的个数：" + count[1]);
		System.out.println("数字 3 的个数：" + count[2]);
		System.out.println("非法数字的个数：" + count[3]);
	}

}
