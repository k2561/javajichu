import java.util.Scanner;


public class TestPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utility util=new Utility();
		Scanner input =new Scanner(System.in);
		System.out.println("������һ��������");
		int n =input.nextInt(); 
			boolean flag=util.isPrime(n);
		if(flag){
			System.out.println(n+"��������");
		}else{
			System.out.println(n+"����������");
		}

	}

}
