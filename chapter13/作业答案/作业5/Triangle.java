import java.util.*;
public class Triangle {
	/**
	 * �����ε��ж�
	 * @param a��b��c�߳�
	 * @return �Ƿ���������
	 */
	public boolean isTriangle(int a,int b,int c){
		boolean flag=false;
		if((a+b)>c &&(b+c)>a &&(a+c)>b){
			flag=true;
		}
		return flag;
	}
	/**
	 * �����ε���״�ж�
	 * @param a��b��c�߳�
	 * @return ����������
	 */
	public String Shape(int a,int b,int c){
		String shape="";		
		
		if((a==b)&&(b==c)&&(c==a)){
			shape="�ȱ�������";
		}else if((a==b)||(b==c)||(c==a)){
			shape="����������";
		}else {
			int A=a*a;
			int B=b*b;
			int C=c*c;
			if((A>B+C)||(B>A+C)||(C>A+B)){
				shape="�۽�������";
			}else if((A==B+C)||(B==A+C)||(C==A+B)){
				shape="ֱ��������";
			}else{
				shape="���������";
			}
		}
		return shape;
	}
}
