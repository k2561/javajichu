
import java.util.Scanner;

public class Award {
	public static void main(String[] args) {
		System.out.print("考试成绩是： ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt(); // 考试成绩
		if(score>100 || score<0){
			System.out.println("必须在1--100之间");
		}else{
			switch (score / 10) {
			case 10:
				System.out.println("父亲给她买辆车");
				break;
			case 9:
				System.out.println("母亲给她买台笔记本电脑");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("母亲给她买部手机");
				break;
			default:
				System.out.println("没有礼物");
			}

		}
	
	}

}

