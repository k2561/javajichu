package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ˳�����ͼ��
 */
public class Book {
	public static void main(String[] args) {
		String[] books = new String[]{"Computer","Hibernate","Java","Struts"};
		String[] newBooks = new String[books.length+1];    //��������������
		String book = "";	//�����û������ͼ������
		int index = books.length;    //�����������λ��
		//�������ǰ�Ľ��
		System.out.print("����ǰ������Ϊ��");
		for(int i = 0; i < books.length ; i++){	
		System.out.print(books[i]+"  ");
		}
		//������books�е�Ԫ�ظ��Ƶ�����newBooks��
		for(int i = 0; i < books.length; i++){
			newBooks[i] = books[i];
		}
		//������������
		Scanner input = new Scanner(System.in);
		System.out.print("\n�������������ƣ�");
		book = input.nextLine();
		//�ҵ���Ԫ�صĲ���λ��
		for(int i = 0; i < books.length; i++){
			if(books[i].compareToIgnoreCase(book) > 0){
				index = i;
				break;
			}
		}
		for(int i = newBooks.length-1; i > index; i--){
			newBooks[i] = newBooks[i-1];    //index�±꿪ʼ��Ԫ�غ���һ��λ��
		}
		newBooks[index] = book;    //��Ԫ�ط���index��λ��
		//��������Ľ��
		System.out.print("����������Ϊ��");
		for(int i = 0; i < newBooks.length; i++){
			System.out.print(newBooks[i]+"  ");
		}
	}
}
