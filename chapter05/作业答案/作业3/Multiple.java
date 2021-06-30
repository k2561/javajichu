package cn.jbit.loops1;

public class Multiple {

	/**
	 * 1至50中是7的倍数的数值之和
	 */
	public static void main(String[] args) {
		int sum = 0;
		int i = 7;
		do{
			sum = sum + i;
			i = i + 7;
		}while(i < 50);
		System.out.println("1至50中是7的倍数的数值之和为：" + sum);
	}
}
