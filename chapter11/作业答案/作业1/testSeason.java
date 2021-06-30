import java.util.Scanner;

public class testSeason {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Season sn=new Season();
		//获取输入
		/* 接收成绩 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份：");
		int mon = input.nextInt();
		switch(mon){
			case 1:
			case 2:
			case 3:
				System.out .println(sn.spring());
				break;
			case 4:
			case 5:
			case 6:
				System.out .println(sn.summer());
				break;
			case 7:
			case 8:
			case 9:			
				System.out .println(sn.autumn());
				break;
			case 10:
			case 11:
			case 12:
				System.out .println(sn.winter());
				break;
			default:
					System.out .println("输入有误，请输入1~12月份数。");
				break;
			
		}
		

	}

}
