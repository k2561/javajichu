
public class Calculator {	
	
	/**
	 * �����
	 * 
	 */
	public int ope(int op,int num1,int num2){
		if(op==1){
			return add(num1,num2);
		}else if(op==2){
			return minus(num1,num2);
		}else if(op==3){
			return multiple(num1,num2);
		}else{
			return divide(num1,num2);
		}	
	}
	
	/**
	 * �ӷ�
	 * @return num1+num2
	 */
	public int add(int num1,int num2){
		return (num1 + num2);
	}
	/**
	 * ����
	 * @return num1-num2
	 */
	public int minus(int num1,int num2){
		return (num1 - num2);
	}

	/**
	 * �˷�
	 * @return num1*num2
	 */
	public int multiple(int num1,int num2){
		return (num1 * num2);
	}
	/**
	 * ����
	 * @return num1/num2
	 */
	public int divide(int num1,int num2){
		return (num1/num2);
	}
}
