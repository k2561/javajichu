public class MovingDesk {
	public static void main(String[] args) {
		int age = 5;
		char sex = 'Ů';
		switch (age) {
		  case 1:
		  case 2:
		  case 3:
		  case 4:
			System.out.println("���ܰᶯ����");
			break;
		  case 5:
		  case 6:
			switch (sex) {
			  case '��':
				System.out.println("�ܰᶯ����");
				break;
			  case 'Ů':
				System.out.println("���ܰᶯ����");
				break;
			}
			break;
		  case 7:
		  default:
			System.out.println("�ܰᶯ����");
			break;
		}
	}
}
