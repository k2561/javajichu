package cn.jbit.loops1;

public class Descending {

	/**
	 * 从100每次递减5输出直至5
	 */
	public static void main(String[] args) {
		int i = 100;
		while(i >= 5){
			System.out.print(i + " ");
			i = i - 5;
		}
	}
}
