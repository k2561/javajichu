package cn.jbit.myshopping;

public class Pay {

	/*
	 * �������
	 */
	public static void main(String[] args) {
		int shirtPrice = 245; //�����۸�
		int shoePrice = 570;  //����Ь�۸�
		int padPrice = 320;   //�����ļ۸�
		int shirtNo=2;        //��������
		int shoeNo =1;        //�˶�Ь��Ŀ
		int padNo = 1;        //��������Ŀ
		double discount = 0.8;
		
		/*���������ܽ��*/
		double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
		System.out.println("�����ܽ�" + finalPay);
	}
}
