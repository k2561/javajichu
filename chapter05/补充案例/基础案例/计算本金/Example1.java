

public class Example1 {

	public static void main(String[] args) {
		double money = 1000;
		double interest = 0.003;
		int year = 1;
		while(year <= 5){
			money = money + money * interest;
			year++;
		}
		System.out.println("5年后，获得的本金共有" + money);
	}
}
