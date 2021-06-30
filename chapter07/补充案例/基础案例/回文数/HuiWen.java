
import java.util.*;
public class Huiwen {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个4位数字： ");
		int num = input.nextInt();
		int i;
		int temp = num;
		for(i = 0; i < 5; i++){   //分解
			a[i] = temp % 10;
			temp = temp / 10;
		}
		boolean isCorrect = true;  
		for(i = 0; i < 5; i++){
			if(!(a[i] == a[4-i])){   //有一对不相同则不是回文
			    isCorrect = false;
			    break;
			}
		}
		if(isCorrect){
			System.out.println(num + "是回文！");
		}else{
			System.out.println(num + "不是回文！");
		}
	}

}
