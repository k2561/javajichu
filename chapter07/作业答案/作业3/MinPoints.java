package cn.jbit.array;

public class MinPoints {

	/**
	 * �����ͻ���
	 */
	public static void main(String[] args) {
		int[] points = {18,25,7,36,13,2,89,63};
		int min = points[0];	//������ͻ���
		int index = 0;			//��ͻ����±�
		//ѭ���Ƚϣ��ҵ���ͻ��ּ����±�
		for(int i = 1; i < points.length; i++){
			if(points[i] < min){
				min = points[i];
				index = i;
			}
		}
		System.out.println("��ͻ����ǣ�" + min);
		System.out.println("��ͻ��������±��ǣ�" + index);
	}
}
