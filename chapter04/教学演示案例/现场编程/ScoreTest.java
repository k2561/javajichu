import java.util.*;

/**
 * 总结：现场编程1
 */
public class ScoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt(); // 接收成绩
		if (score == 100) {
			System.out.println("他爸爸给他买辆车");
		} else if (score >= 90) {
			System.out.println("他妈妈给他买MP4");
		} else if (score < 90 && score >= 60) {
			System.out.println("他妈妈给他买本参考书");
		} else {
			System.out.println("什么都不买");
		}
	}

}
