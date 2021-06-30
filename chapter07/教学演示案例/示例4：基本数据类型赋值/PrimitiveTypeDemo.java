package cn.jbit.array;

public class PrimitiveTypeDemo {

	/**
	 * 基本数据类型示例
	 */
	public static void main(String[] args) {
		int heightZhang = 170;		//张浩的身高
		int heightLi = heightZhang;	//李明的身高与张浩身高相同
		System.out.println("去年--张浩的身高是：" + heightZhang +
			"， 李明的身高是：" + heightLi);
		heightLi = 180;				//今年李明的身高变为180
		System.out.println("今年--张浩的身高是：" + heightZhang +
			"， 李明的身高是：" + heightLi);
	}
}
