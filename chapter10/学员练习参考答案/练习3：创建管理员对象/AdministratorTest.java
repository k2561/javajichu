package cn.jbit.classandobject;

public class AdministratorTest {
	public static void main(String[] args) {
		Administrator admin1 = new Administrator();	//��������Ա����1
		Administrator admin2 = new Administrator();	//��������Ա����2
		//������Ա����1��ֵ��������ʾ����
		admin1.name = "admin1";
		admin1.password = "111111";
		admin1.show();
		//������Ա����2��ֵ��������ʾ����
		admin2.name = "admin2";
		admin2.password = "222222";
		admin2.show();
	}
}
