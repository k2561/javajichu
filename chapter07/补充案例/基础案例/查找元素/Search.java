import java.util.*;
public class Search {

	public static void main(String[] args) {
		String name[] = new String[10];
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("��¼��ѧԱ������");
		
		for(i = 0; i < 10; i++){     //ѭ��¼��
			name[i] = input.next();
		}
		System.out.print("������Ҫ���ҵ�ѧԱ������ ");
		String search =  input.next();
		for(i = 0; i < 10; i++){    //ѭ������
			if(name[i].equals(search)){   //���ҵ��˳�����¼��ǰ�±�
				break;
			}
		}
		if(i<10){
			System.out.println("��ѧԱ�ڴ˰࣡");
		}else{
			System.out.println("û���ҵ���");
		}

	}

}
