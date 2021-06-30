package cn.jbit.classandobject;

public class TestScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Students stu=new Students();
		Score sc=new Score();
		float avg=0;
		//赋予属性值
		stu.java=80;
		stu.database=95;
		stu.html=77;		
		avg=sc.getAvg(stu);//方法的参数传递对象
		System.out.println("该学生的平均分为："+avg);
	}
}
