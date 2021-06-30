
public class Example2 {
	public static void main(String[] args) {
	     int n = 0;
	     int count = 0;
	     while(n <= 1000){
	    	 if(n % 7 ==0){
	    		 count = count + n;
	    	 }
	    	 n++;
	     }
	     System.out.println("1000之内能被7整除的数之和是：" + count);
	}
}
