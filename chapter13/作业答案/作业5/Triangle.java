import java.util.*;
public class Triangle {
	/**
	 * 三角形的判断
	 * @param a、b、c边长
	 * @return 是否是三角形
	 */
	public boolean isTriangle(int a,int b,int c){
		boolean flag=false;
		if((a+b)>c &&(b+c)>a &&(a+c)>b){
			flag=true;
		}
		return flag;
	}
	/**
	 * 三角形的形状判断
	 * @param a、b、c边长
	 * @return 何种三角形
	 */
	public String Shape(int a,int b,int c){
		String shape="";		
		
		if((a==b)&&(b==c)&&(c==a)){
			shape="等边三角形";
		}else if((a==b)||(b==c)||(c==a)){
			shape="等腰三角形";
		}else {
			int A=a*a;
			int B=b*b;
			int C=c*c;
			if((A>B+C)||(B>A+C)||(C>A+B)){
				shape="钝角三角形";
			}else if((A==B+C)||(B==A+C)||(C==A+B)){
				shape="直角三角形";
			}else{
				shape="锐角三角形";
			}
		}
		return shape;
	}
}
