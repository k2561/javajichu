package cn.jbit.loops2;
public class PersonCount {

	/**
	 * �������˼�ָ��е���ѧ��
	 */
	public static void main(String[] args) {
		int men = 0;	//����
		int women = 0;	//Ů��
		int kids = 0;	//С��
		for(;men<=10;men++){
			women = 20 - 2*men;
			kids = 30 - men - women;
			if(3*men + 2*women + kids == 50){
				System.out.println(men+"������" +men+ " Ů��" +women+ " С��" +kids);
			}
		}
	}
}