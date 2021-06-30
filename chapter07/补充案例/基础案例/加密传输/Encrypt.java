
import java.util.*;
public class Encrypt {

	public static void main(String[] args) {
		int[] a = new int[4];
		int temp;    //临时变量,用于作交换
		int i;
		Scanner input =new Scanner(System.in);
		System.out.print("请输入一个4位数字： ");
		int num = input.nextInt();
		int t = num;
		for(i = 0; i < 4; i++){   //分解
			a[i] = t % 10;
			t = t / 10;
		}
		for(i = 0; i < 4; i++){
			a[i] = a[i] + 5;
			a[i] = a[i] % 10;
		}
		for(i = 0; i <=1; i++){   //交换
			temp = a[i];
			a[i] = a[3-i];
			a[3-i] = temp;
		}
		System.out.print("加密后的4位数字是：");
		for(i = 3; i >= 0; i--){   //输出
			System.out.print(a[i]);
		}
	}
}
