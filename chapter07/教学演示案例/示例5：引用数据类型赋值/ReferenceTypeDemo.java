package cn.jbit.array;

public class ReferenceTypeDemo {

	/**
	 * ������������ʾ��
	 */
	public static void main(String[] args) {
		int[] infoZhang = new int[]{170,60};
		int[] infoLi = infoZhang;
		System.out.println("ȥ��--�źƵ�����ǣ�" + infoZhang[0] + " �����ǣ�"+ infoZhang[1] +
				"�� ����������ǣ�" + infoLi[0] + " �����ǣ�"+ infoLi[1]);
		infoLi[0] = 180;	//������������߱�Ϊ180
		infoLi[1] = 70;		//�������������ر�Ϊ70
		System.out.println("����--�źƵ�����ǣ�" + infoZhang[0] + " �����ǣ�"+ infoZhang[1] +
			"�� ����������ǣ�" + infoLi[0] + " �����ǣ�"+ infoLi[1]);
	}
}
