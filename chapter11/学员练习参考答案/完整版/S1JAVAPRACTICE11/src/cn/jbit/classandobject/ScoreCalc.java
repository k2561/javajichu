package cn.jbit.classandobject;
/**
 * ScoreCalc��
 */
public class ScoreCalc {
	int java; // Java�ɼ�
	int c; // C#�ɼ�
	int db; // DB�ɼ�
	/**
	 * �����ܳɼ�	 
	 */
	public int calcTotalScore() {
		int total = java + c + db;
		return total;
	}

	/**
	 * ��ʾ�ܳɼ�
	 */
	public void showTotalScore() {
		System.out.println("�ܳɼ��ǣ� " + calcTotalScore());
	}

	/**
	 * ����ƽ���ɼ�
	 */
	public int calcAvg() {
		int avg = (java + c + db) / 3;
		return avg;
	}

	/**
	 * ��ʾƽ���ɼ�
	 */
	public void showAvg() {
		System.out.println("ƽ���ɼ��ǣ� " + calcAvg());
	}
}
