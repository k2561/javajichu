/**
 * 比赛名单。
 * 
 * @author 北大青鸟
 */
public class CompetitionList {
	public static void main(String args[]) {
		for (char i = 'X'; i <= 'Z'; i++) {  //A的对手
			for (char j = 'X'; j <= 'Z'; j++) {  //B的对手
				if (i != j) {
					for (char k = 'X'; k <= 'Z'; k++) { //C的对手
						if (i != k && j != k) {
							if (i != 'X' && k != 'X' && k != 'Z')
								System.out.println("\nA---" + i + "\nB---" + j
										+ "\nC---" + k);
						}
					}
				}
			}

		}
	}
}