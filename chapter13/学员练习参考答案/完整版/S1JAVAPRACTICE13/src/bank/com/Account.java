package bank.com;
/**
 * �ϻ��׶�4�� ģ���˻���ѯ��ʵ�ִ�ȡ��
 *
 */
public class Account {
	double money = 0;  //��ʼ���Ϊ0Ԫ
    
    /**
     * ��ѯ�ʻ����
     * @return money ��ǰ���
     */
    public double getMoney(){
   	 return money;
    }
    
    /**
     * ���
     * @param s �����Ŀ
     */
    public void save(double s){
   	 money = money + s;
   	 System.out .println("���ɹ�");
   	 System.out .println("\n***��ǰ���Ϊ��"+getMoney()+"Ԫ***");
    }
    
    /**
     * ȡ��
     * @param a ȡ����Ŀ
     */
    public void deposit(double a){
   	 if(money >= a){
   		 money = money - a;
   		System.out .println("ȡ��ɹ�");
   		System.out .println("\n***��ǰ���Ϊ��"+getMoney()+"Ԫ***");
   	 }else{
   		 System.out.println("���㣡");
   		System.out .println("\n***��ǰ���Ϊ��"+getMoney()+"Ԫ***");
   	 }
    }
}
