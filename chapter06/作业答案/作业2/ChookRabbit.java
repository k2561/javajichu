package cn.jbit.loops2;

public class ChookRabbit {
	/**
	 * 鸡兔同笼
	 */
	public static void main(String args[]){
		int rabbitNum = 0;
		for(int chookNum = 0; chookNum < 35; chookNum++){
			rabbitNum = 35 - chookNum;
			if(2*chookNum + 4*rabbitNum == 94){
				System.out.println("鸡有 " +chookNum+ "只，兔子有 " +rabbitNum+ " 只");
			}	
		}
	}
}
