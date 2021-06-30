/*
 * 公司类
 */
public class Company {
	String name;
	String tel;
	String email;
	String product;

	public String toString() {
		return "公司名称： " + name 
		   + "\n电话号码： " + tel 
		   + "\n电子邮箱： " + email
		   + "\n产品种类： " + product;
	}

	public static void main(String[] args) {
		Company company1 = new Company();
		company1.name = "法拉力公司";
		company1.tel = "13012034527";
		company1.email = "info@fll.com";
		company1.product = "汽车配件";
		System.out.println(company1);
	}
}
