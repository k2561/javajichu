package cn.jbit.loops1;

public class Multiple {

	/**
	 * 1��50����7�ı�������ֵ֮��
	 */
	public static void main(String[] args) {
		int sum = 0;
		int i = 7;
		do{
			sum = sum + i;
			i = i + 7;
		}while(i < 50);
		System.out.println("1��50����7�ı�������ֵ֮��Ϊ��" + sum);
	}
}
