package cn.jbit.classandobject;

public class sbAppend {

	/**
	 * 理论课示例8：StringBuffer类的append()
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("青春无悔"); 
		int num=110;
		StringBuffer sb1 = sb.append("我心永恒");  //在字符串后面追加字符串
		System.out.println(sb1);
		StringBuffer sb2 = sb1.append('啊');       //在字符串后面追加字符
		System.out.println(sb2);
		StringBuffer sb3 = sb2.append(num);        //在字符串后面追加整型数字
		System.out.println(sb3);
	}
}
