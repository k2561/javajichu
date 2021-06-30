/**
 * 小结2:现场编程1
 */
public class CalcDays {
	public static void main(String[] args) {
		int days = 46; // 天数
		int week = days / 7; // 星期
		int leftDay = days % 7;// 剩余的天数

		System.out.println(days + "天等于" + week + "周零" + leftDay + "天");
	}
}
