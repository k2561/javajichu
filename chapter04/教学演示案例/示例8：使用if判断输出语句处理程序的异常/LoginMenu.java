import java.util.Scanner;
public class LoginMenu {
	public static void main(String[] args) {
		System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ1.0��\n");
		System.out.println("\t\t\t 1. �� ¼ ϵ ͳ\n");
		System.out.println("\t\t\t 2. �� ��\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,��������:");

		/* �Ӽ��̻�ȡ��Ϣ����ִ����Ӧ����---�¼Ӵ��� */
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt()==true){
			int num = input.nextInt();
			switch (num) {
			  case 1:
			    //ʡ��
			    break;
			  case 2:
			    /* �˳�ϵͳ */
			    System.out.println("лл����ʹ�ã�");
			    break;
			  default:
			    System.out.println("�������");
			    break;
			}
		}else{
			System.out.println("��������ȷ�����֣�");
		}
	}
}
