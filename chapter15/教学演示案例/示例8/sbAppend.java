package cn.jbit.classandobject;

public class sbAppend {

	/**
	 * ���ۿ�ʾ��8��StringBuffer���append()
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("�ഺ�޻�"); 
		int num=110;
		StringBuffer sb1 = sb.append("��������");  //���ַ�������׷���ַ���
		System.out.println(sb1);
		StringBuffer sb2 = sb1.append('��');       //���ַ�������׷���ַ�
		System.out.println(sb2);
		StringBuffer sb3 = sb2.append(num);        //���ַ�������׷����������
		System.out.println(sb3);
	}
}
