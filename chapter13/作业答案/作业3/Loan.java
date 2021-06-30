
public class Loan {
	/**
	 * º∆À„‘¬π©
	 * @return money
	 */
	public double loan(double loan,int yearchoice){
		double money=0;
	
		if(yearchoice==1){
			money=(loan+loan*0.0603)/36;
		}else if(yearchoice==2){
			money=(loan+loan*0.0612)/60;
		}else{
			money=(loan+loan*0.0639)/240;
		}		
		return money;
	}
	
}
