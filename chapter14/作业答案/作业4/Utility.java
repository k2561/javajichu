
public class Utility {
	/**
	 * �ж�����n�Ƿ�Ϊ����
	 * @param n
	 * @return
	 */
	public boolean isPrime(int n){
		boolean flag=true;
		int max=(int)Math.sqrt(n);
		for(int i=2;i<=max;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}
