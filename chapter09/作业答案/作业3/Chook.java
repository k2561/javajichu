package cn.jbit.nestedloops;

public class Chook {

	/**
	 * ��Ǯ��ټ�
	 */
	public static void main(String[] args) {
		int way = 1;	//��
		int k = 0;	//������
		for(int i=1;i<=20;i++){		//������
			for(int j=1;j<=33;j++){	//ĸ����
				k = 100-i-j;		//һ��100ֻ��
				if(k%3 == 0 && (5*i+3*j+k/3 == 100)){//��������3�ı������ܼ�100��Ǯ
					System.out.print("[�� " + way++ + "] ");
					System.out.println("����: " +i+ "	ĸ����" +j+ "	 ������" +k);

				}
			}
		}

	}

}
