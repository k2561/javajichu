
public class Example3 {

	/**
	 * 猴子吃桃子的问题
	 * @param args
	 */
	public static void main(String[] args) {
		int x1 = 0;   //前一天的桃子
		int x2 = 1;   //当天早上的桃子
		for(int day = 9; day > 0; day--){
			x1 = (x2 + 1) * 2;
			x2 = x1;
		}
		System.out.println("猴子共摘桃子的个数是： " + x1);
	}
}
