
public class Example3 {

	/**
	 * ���ӳ����ӵ�����
	 * @param args
	 */
	public static void main(String[] args) {
		int x1 = 0;   //ǰһ�������
		int x2 = 1;   //�������ϵ�����
		for(int day = 9; day > 0; day--){
			x1 = (x2 + 1) * 2;
			x2 = x1;
		}
		System.out.println("���ӹ�ժ���ӵĸ����ǣ� " + x1);
	}
}
