package cn.dbit.demo;

public class AutoTypeChange {

	/*
	 * 数据类型转换
	 */
	public static void main(String[] args) {
	double firstAvg = 81.29;   	//第一次平均分
        double secondAvg;          	//第二次平均分
        int rise = 2;              	//增长的分数
        //自动类型转换
        secondAvg = firstAvg + rise;  
        //显示第二次考试平均分
        System.out.println("第二次平均分是："  + secondAvg);
	}
}
