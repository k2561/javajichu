package cn.jbit.array;

public class ArrayCopy {

	/**
	 * ���鸴��
	 */
	public static void main(String[] args) {
		int[] infoZhang = new int[]{170,60};
		int[] infoLi = new int[2];
		System.out.println("����ǰ--����������ǣ�" + infoLi[0] + " �����ǣ�"+ infoLi[1]);
		for(int i = 0; i < infoZhang.length; i++){
			infoLi[i] = infoZhang[i];	//�źƵ���Ϣ���Ƹ�����
		}
		System.out.println("ȥ��--�źƵ�����ǣ�" + infoZhang[0] + " �����ǣ�"+ infoZhang[1] +
				"�� ����������ǣ�" + infoLi[0] + " �����ǣ�"+ infoLi[1]);
		infoLi[0] = 180;	//������������߱�Ϊ180
		infoLi[1] = 70;		//�������������ر�Ϊ70
		System.out.println("����--�źƵ�����ǣ�" + infoZhang[0] + " �����ǣ�"+ infoZhang[1] +
			"�� ����������ǣ�" + infoLi[0] + " �����ǣ�"+ infoLi[1]);
	}
}
