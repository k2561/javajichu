package cn.jbit.loops1;

public class EvenSum {

	/**
	 * ����100����ż��֮��
	 */
	public static void main(String[] args) {
		int sum = 0;	//��ǰ֮��
		int num = 2;	//����
		while(num <= 100){
			sum = sum + num;	//�ۼ�
			num = num + 2;
		}
		System.out.println("100���ڵ�ż��֮��Ϊ��" + sum);
	}
}
