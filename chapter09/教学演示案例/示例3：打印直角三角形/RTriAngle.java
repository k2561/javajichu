package cn.jbit.nestedloops;
/**
 * ��ӡֱ��������
 */
public class RTriAngle {
	public static void main(String[] args) {
		int rows = 3;
		System.out.println("��ӡֱ��������");
		for(int i = 0; i < rows; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.print("\n");		//����
		}
	}
}
