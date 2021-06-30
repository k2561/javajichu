package cn.jbit.ifdemo;

public class SimpleIf {
	public static void main(String[] args) {
		int score = 91;    //张浩的Java成绩
        if ( score > 98 ) {
            System.out.println("老师说:不错，奖励一个MP4！");
        } 
        if ( score <= 98 )  {
            System.out.println("老师说:惩罚进行编码！");
        }
	}
}
