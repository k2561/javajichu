
import java.util.Scanner;
/**
 * 判断是否能被3或5正常
 * @author 北大青鸟
 *
 */
public class Divide {	
	public static void main(String[] args) {
		int n;  
		Scanner input = new Scanner(System.in);
		System.out.println("请输入n7的值：");
		n = input.nextInt();
		if(n%3==0||n%5==0){
			System.out.println("该整数是3或5的倍数。");
		}else{
			System.out.println("该数不能被3或5中的任何一个数整除。");
		}

	}

}
