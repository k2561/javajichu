package bank.com;
/**
 * 上机阶段4： 模拟账户查询，实现存取款
 *
 */
public class Account {
	double money = 0;  //初始余额为0元
    
    /**
     * 查询帐户余额
     * @return money 当前余额
     */
    public double getMoney(){
   	 return money;
    }
    
    /**
     * 存款
     * @param s 存款数目
     */
    public void save(double s){
   	 money = money + s;
   	 System.out .println("存款成功");
   	 System.out .println("\n***当前余额为："+getMoney()+"元***");
    }
    
    /**
     * 取款
     * @param a 取款数目
     */
    public void deposit(double a){
   	 if(money >= a){
   		 money = money - a;
   		System.out .println("取款成功");
   		System.out .println("\n***当前余额为："+getMoney()+"元***");
   	 }else{
   		 System.out.println("余额不足！");
   		System.out .println("\n***当前余额为："+getMoney()+"元***");
   	 }
    }
}
