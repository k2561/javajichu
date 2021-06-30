package cn.jbit.array;

public class ArrayCopy {

	/**
	 * 数组复制
	 */
	public static void main(String[] args) {
		int[] infoZhang = new int[]{170,60};
		int[] infoLi = new int[2];
		System.out.println("复制前--李明的身高是：" + infoLi[0] + " 体重是："+ infoLi[1]);
		for(int i = 0; i < infoZhang.length; i++){
			infoLi[i] = infoZhang[i];	//张浩的信息复制给李明
		}
		System.out.println("去年--张浩的身高是：" + infoZhang[0] + " 体重是："+ infoZhang[1] +
				"， 李明的身高是：" + infoLi[0] + " 体重是："+ infoLi[1]);
		infoLi[0] = 180;	//今年李明的身高变为180
		infoLi[1] = 70;		//今年李明的体重变为70
		System.out.println("今年--张浩的身高是：" + infoZhang[0] + " 体重是："+ infoZhang[1] +
			"， 李明的身高是：" + infoLi[0] + " 体重是："+ infoLi[1]);
	}
}
