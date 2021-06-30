import java.util.Scanner;


public class TestPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner input =new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n =input.nextInt(); 
			boolean flag=util.isPrime(n);
		if(flag){
			System.out.println(n+"是素数。");
		}else{
			System.out.println(n+"不是素数。");
		}

	}

}
