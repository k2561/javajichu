package cn.jbit.nestedloops;

public class NumberTriangle {

	/**
	 * 打印数字组成的直角三角形
	 */
	public static void main(String[] args) {
		int rows = 5;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}

}
