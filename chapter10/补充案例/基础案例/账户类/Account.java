
/*
 * �˻���
 */
public class Account {
    double money = 8000;   //�˻����
    
    /*
     * ��ѯ���
     */
    public double getMoney(){
    	return money;
    }
    
    /*
     * ���
     */
    public void save(double savedMoney){
    	money = money + savedMoney;
    } 
    
    /*
     * ���
     */
    public void withdraw(double withdraw){
    	if(withdraw >= money){
    		System.out.println("���㣡");
    	}else{
    		money = money - withdraw;
    	}
    }
}
