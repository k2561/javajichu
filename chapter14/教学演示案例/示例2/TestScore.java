package cn.jbit.classandobject;

public class TestScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Students stu=new Students();
		Score sc=new Score();
		float avg=0;
		//��������ֵ
		stu.java=80;
		stu.database=95;
		stu.html=77;		
		avg=sc.getAvg(stu);//�����Ĳ������ݶ���
		System.out.println("��ѧ����ƽ����Ϊ��"+avg);
	}
}
