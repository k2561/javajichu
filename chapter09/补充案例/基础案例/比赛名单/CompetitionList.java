/**
 * ����������
 * 
 * @author ��������
 */
public class CompetitionList {
	public static void main(String args[]) {
		for (char i = 'X'; i <= 'Z'; i++) {  //A�Ķ���
			for (char j = 'X'; j <= 'Z'; j++) {  //B�Ķ���
				if (i != j) {
					for (char k = 'X'; k <= 'Z'; k++) { //C�Ķ���
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