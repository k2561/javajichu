package cn.jbit.nestedloops;
/**
 * 打印直角三角形
 */
public class RTriAngle {
	public static void main(String[] args) {
		int rows = 3;
		System.out.println("打印直角三角形");
		for(int i = 0; i < rows; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.print("\n");		//换行
		}
	}
}
