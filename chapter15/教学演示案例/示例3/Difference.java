package cn.jbit.classandobject;

public class Difference {

	/**
	 * ���ۿ�ʾ��3��==��equals()����
	 */
	public static void main(String[] args) {
		String str1=new String("�Ұ��ҵ����");
		String str2=new String("�Ұ��ҵ����");
		if(str1.equals(str2)){
			System.out.println("�����ַ���ֵ��ͬ��");
		}else{
			System.out.println("�����ַ���ֵ����ͬ��");
		}
		if(str1==str2){
			System.out.println("�����ַ�����ͬ��");
		}else{
			System.out.println("�����ַ�������ͬ��");
		}
	}
}
