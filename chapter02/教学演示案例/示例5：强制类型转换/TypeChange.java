package cn.dbit.demo;

public class TypeChange {
	/*
	 * �Զ�����ת��
	 */
	public static void main(String[] args) {
	     int before = 20;        			//apple�ʼǱ��г��ݶ�
	     double rise = 9.8;       			//�����ķݶ�
	     //�����µ��г��ݶ�(double�ͱ���ǿ��ת����int�ͱ���)
	     int now = before + (int)rise;  	//���ڵķݶ�
	     System.out.println("�µ��г��ݶ��ǣ�" + now);
	}
}
