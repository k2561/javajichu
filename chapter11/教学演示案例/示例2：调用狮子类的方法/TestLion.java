package cn.jbit.classandobject;
/*
 * TestLion.java  ����AutoLion����
 */
public class TestLion {
	public static void main(String[] args) {
		 AutoLion lion = new AutoLion();         //����AutoLion����
         System.out.println(lion.showLion());    //���÷�����ʾ����Ϣ
         lion.run();                             //�����ܷ���
         System.out.println(lion.bark());        //���ýз���
	}
}
