package cn.jbit.classandobject;
/**
 * ScoreCalc类
 */
public class ScoreCalc {
	int java; // Java成绩
	int c; // C#成绩
	int db; // DB成绩
	/**
	 * 计算总成绩	 
	 */
	public int calcTotalScore() {
		int total = java + c + db;
		return total;
	}

	/**
	 * 显示总成绩
	 */
	public void showTotalScore() {
		System.out.println("总成绩是： " + calcTotalScore());
	}

	/**
	 * 计算平均成绩
	 */
	public int calcAvg() {
		int avg = (java + c + db) / 3;
		return avg;
	}

	/**
	 * 显示平均成绩
	 */
	public void showAvg() {
		System.out.println("平均成绩是： " + calcAvg());
	}
}
