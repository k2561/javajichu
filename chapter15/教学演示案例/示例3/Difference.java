package cn.jbit.classandobject;

public class Difference {

	/**
	 * 理论课示例3：==和equals()区别
	 */
	public static void main(String[] args) {
		String str1=new String("我爱我的祖国");
		String str2=new String("我爱我的祖国");
		if(str1.equals(str2)){
			System.out.println("两个字符串值相同。");
		}else{
			System.out.println("两个字符串值不相同。");
		}
		if(str1==str2){
			System.out.println("两个字符串相同。");
		}else{
			System.out.println("两个字符串不相同。");
		}
	}
}
