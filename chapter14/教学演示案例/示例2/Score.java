package cn.jbit.classandobject;
/**
 * ѧ���ɼ������� 
 *
 */
public class Score {
	/**
	 * ʾ��2������ƽ���֣�������Ϊ����	
	 * @return avg ƽ����
	 */	
	public float getAvg(Students stu){
		float avg=0;
		avg=(stu.java +stu.database +stu.html )/3;		
		return avg;
	}
}
