package cn.jbit.classandobject;
/**
 * 学生成绩计算类 
 *
 */
public class Score {
	/**
	 * 示例2：计算平均分，对象作为参数	
	 * @return avg 平均分
	 */	
	public float getAvg(Students stu){
		float avg=0;
		avg=(stu.java +stu.database +stu.html )/3;		
		return avg;
	}
}
