package cn.jbit.classandobject;

public class InitialSchool {


	public static void main(String[] args) {
		School center = new School();
		System.out.println("***��ʼ����Ա����ǰ***");
		center.showCenter();
		center.schoolName = "��������";		//��schoolName���Ը�ֵ
		center.classNumber = 10;			//��classNumber���Ը�ֵ
		center.labNumber = 10;				//��labNumber���Ը�ֵ
		System.out.println("\n***��ʼ����Ա������***");
		center.showCenter();
	}
}
