package cn.jbit.nestedloops;

public class Chook {

	/**
	 * 百钱买百鸡
	 */
	public static void main(String[] args) {
		int way = 1;	//买法
		int k = 0;	//雏鸡数
		for(int i=1;i<=20;i++){		//公鸡数
			for(int j=1;j<=33;j++){	//母鸡数
				k = 100-i-j;		//一共100只鸡
				if(k%3 == 0 && (5*i+3*j+k/3 == 100)){//雏鸡数是3的倍数，总计100文钱
					System.out.print("[买法 " + way++ + "] ");
					System.out.println("公鸡: " +i+ "	母鸡：" +j+ "	 雏鸡：" +k);

				}
			}
		}

	}

}
