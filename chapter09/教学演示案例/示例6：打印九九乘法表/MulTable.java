package cn.jbit.nestedloops;
/**
 * ��ӡ�žų˷���
 */
public class MulTable {
	public static void main(String[] args) {
		int rows = 9;						//�˷��������
		for(int i = 1; i<=rows; i++){		//һ��9��
			for(int j = 1; j <= i; j++){	//��i����i��ʽ��
				System.out.print(j+"*"+i+"="+j*i+"	");
			}
			System.out.print("\n");			//��ӡ��һ�к���
		}
	}
}
