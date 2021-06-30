import java.util.*;

/**
 * 总结：现场编程2
 */
public class Dial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		switch (no) {
		 case 1:
			System.out.println("拨爸爸的号");
			break;
		 case 2:
			System.out.println("拨妈妈的号");
			break;
		 case 3:
			System.out.println("拨爷爷的号");
			break;
		 case 4:
			System.out.println("拨奶奶的号");
			break;
		 default:
			break;
		}
	}
}
