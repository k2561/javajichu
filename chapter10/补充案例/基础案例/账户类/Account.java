
/*
 * 账户类
 */
public class Account {
    double money = 8000;   //账户余额
    
    /*
     * 查询余额
     */
    public double getMoney(){
    	return money;
    }
    
    /*
     * 存款
     */
    public void save(double savedMoney){
    	money = money + savedMoney;
    } 
    
    /*
     * 提款
     */
    public void withdraw(double withdraw){
    	if(withdraw >= money){
    		System.out.println("余额不足！");
    	}else{
    		money = money - withdraw;
    	}
    }
}
