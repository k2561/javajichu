package cn.jbit.array;

public class PrimitiveTypeDemo {

	/**
	 * ������������ʾ��
	 */
	public static void main(String[] args) {
		int heightZhang = 170;		//�źƵ����
		int heightLi = heightZhang;	//������������ź������ͬ
		System.out.println("ȥ��--�źƵ�����ǣ�" + heightZhang +
			"�� ����������ǣ�" + heightLi);
		heightLi = 180;				//������������߱�Ϊ180
		System.out.println("����--�źƵ�����ǣ�" + heightZhang +
			"�� ����������ǣ�" + heightLi);
	}
}
