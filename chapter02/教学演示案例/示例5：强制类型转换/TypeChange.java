package cn.dbit.demo;

public class TypeChange {
	/*
	 * 自动类型转换
	 */
	public static void main(String[] args) {
	     int before = 20;        			//apple笔记本市场份额
	     double rise = 9.8;       			//增长的份额
	     //计算新的市场份额(double型变量强制转化成int型变量)
	     int now = before + (int)rise;  	//现在的份额
	     System.out.println("新的市场份额是：" + now);
	}
}
