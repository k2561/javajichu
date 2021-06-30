import java.util.*;

public class Bank {
	int year; // ����
	double money; // ����Ľ��

	public double getInterest() {
		double interest; // ��Ϣ

		if (year >= 1) {
			interest = (money * 3 * year) / 100;
		} else {
			interest = 0;
		}
		return interest;
	}

	public double getTotalMoney() {
		double total = money + getInterest(); // �ܶ�
		return total;
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner input = new Scanner(System.in);
		System.out.println("����������: ");
		bank.money = input.nextDouble();
		System.out.println("\n������������: ");
		bank.year = input.nextInt();
		System.out.println("��Ϣ�� " + bank.getInterest());
		System.out.println(bank.year + "�����ܶ��ǣ�" + bank.getTotalMoney());
	}
}
