
import java.util.*;
public class DeleteElement {

	public static void main(String[] args) {
		int a[]={1,4,6,9,13,16,19,28,40,100};
		int number,i,j;
		System.out.println("ԭʼ����Ϊ:");
		for(i=0;i<10;i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
		Scanner input = new Scanner(System.in);
		System.out.print("����Ҫɾ������:");
		number = input.nextInt();
		for (i=0;i<10;i++){
		  if (a[i]==number){
			  break;
		  }
		}
		if(i<10){
			if(i <=8 ){
			  for(j=i;j<9;j++){
				  a[j]=a[j+1];
			  }
			}
			System.out.println("\nɾ���������Ϊ:");
			for(i=0;i<9;i++){
				System.out.print(a[i] + "\t");
			}
			System.out.println("\n");
		}else{
			System.out.println("\n������û�������!");
		}

	}
}
