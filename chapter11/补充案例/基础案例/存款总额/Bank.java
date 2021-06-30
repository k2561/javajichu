import java.util.*;

public class Bank {
	int year; // 存期
	double money; // 存入的金额

	public double getInterest() {
		double interest; // 利息

		if (year >= 1) {
			interest = (money * 3 * year) / 100;
		} else {
			interest = 0;
		}
		return interest;
	}

	public double getTotalMoney() {
		double total = money + getInterest(); // 总额
		return total;
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存款金额: ");
		bank.money = input.nextDouble();
		System.out.println("\n请输入存款年数: ");
		bank.year = input.nextInt();
		System.out.println("利息： " + bank.getInterest());
		System.out.println(bank.year + "年后的总额是：" + bank.getTotalMoney());
	}
}
