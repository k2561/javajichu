package cn.jbit.nestedloops;
/**
 * 打印九九乘法表
 */
public class MulTable {
	public static void main(String[] args) {
		int rows = 9;						//乘法表的行数
		for(int i = 1; i<=rows; i++){		//一共9行
			for(int j = 1; j <= i; j++){	//第i行有i个式子
				System.out.print(j+"*"+i+"="+j*i+"	");
			}
			System.out.print("\n");			//打印完一行后换行
		}
	}
}
