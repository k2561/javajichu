package cn.jbit.classandobject;

public class PointsAward {

	/**
	 * ��������
	 */
	public static void main(String[] args) {
		Customer cust = new Customer();	//�����ͻ�����
		cust.points = 3050;
		cust.cardType = "��";
		cust.show();
		if((cust.points>1000 && cust.cardType.equals("��"))||
			(cust.points>5000 && cust.cardType.equals("�տ�"))){
			System.out.println("��������500�֣�");
		}
	}
}
