package cn.jbit.classandobject;
import java.util.Scanner;
public class TestHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Students[] stu = new Students[5];//�������5��Ԫ�ص�ѧ����������
		Height h=new Height();
		Scanner input = new Scanner(System.in);

		for(int i=0;i<5;i++){
			System.out.print("�������"+(i+1)+"��ѧ������ߣ�cm����");
			stu[i]=new Students();//ʵ����
			stu[i].height = input.nextFloat();			
		}
		float avgheight=h.getAvgHeight(stu);//���÷��������ݶ�������
		System.out.println("***��5��ѧ����ƽ�����Ϊ��"+avgheight+"cm***");
	}
}
