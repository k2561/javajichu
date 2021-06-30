package cn.jbit.array;

public class MinPoints {

	/**
	 * 输出最低积分
	 */
	public static void main(String[] args) {
		int[] points = {18,25,7,36,13,2,89,63};
		int min = points[0];	//保存最低积分
		int index = 0;			//最低积分下标
		//循环比较，找到最低积分及其下标
		for(int i = 1; i < points.length; i++){
			if(points[i] < min){
				min = points[i];
				index = i;
			}
		}
		System.out.println("最低积分是：" + min);
		System.out.println("最低积分所在下标是：" + index);
	}
}
