/*
 * ��˾��
 */
public class Company {
	String name;
	String tel;
	String email;
	String product;

	public String toString() {
		return "��˾���ƣ� " + name 
		   + "\n�绰���룺 " + tel 
		   + "\n�������䣺 " + email
		   + "\n��Ʒ���ࣺ " + product;
	}

	public static void main(String[] args) {
		Company company1 = new Company();
		company1.name = "��������˾";
		company1.tel = "13012034527";
		company1.email = "info@fll.com";
		company1.product = "�������";
		System.out.println(company1);
	}
}
