
public class Example1 {

	/**
	 * ¹ÅµäÎÊÌâ£ºÍÃ×Ó
	 * @param args
	 */
	public static void main(String[] args) {
		int f1 = 1;
		int f2 = 1;
		for(int n = 1; n <= 20; n++){
			System.out.println(f1+ "\t" + f2);
			if(n % 2 ==0){
				System.out.print("");
			}
			f1 = f1 + f2;
			f2 = f2 + f1;
		}
	}
}
