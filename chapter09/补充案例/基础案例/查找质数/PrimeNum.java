/**
 * ���2~100֮���������
 * @author ��������
 */
public class PrimeNum {
	public static void main(String args[]) {
		boolean flag;
		for(int i=2;i<=100;i++){
			flag=false;
			for(int j=2; j<Math.sqrt(i);j++){
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(!flag){
				System.out.print(i+ "  ");
			}
		}
	}

}
