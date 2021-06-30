package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * 顺序插入图书
 */
public class Book {
	public static void main(String[] args) {
		String[] books = new String[]{"Computer","Hibernate","Java","Struts"};
		String[] newBooks = new String[books.length+1];    //插入新书后的数组
		String book = "";	//保存用户输入的图书名称
		int index = books.length;    //保存新书插入位置
		//输出插入前的结果
		System.out.print("插入前的数组为：");
		for(int i = 0; i < books.length ; i++){	
		System.out.print(books[i]+"  ");
		}
		//将数组books中的元素复制到数组newBooks中
		for(int i = 0; i < books.length; i++){
			newBooks[i] = books[i];
		}
		//输入新书名称
		Scanner input = new Scanner(System.in);
		System.out.print("\n请输入新书名称：");
		book = input.nextLine();
		//找到新元素的插入位置
		for(int i = 0; i < books.length; i++){
			if(books[i].compareToIgnoreCase(book) > 0){
				index = i;
				break;
			}
		}
		for(int i = newBooks.length-1; i > index; i--){
			newBooks[i] = newBooks[i-1];    //index下标开始的元素后移一个位置
		}
		newBooks[index] = book;    //新元素放在index的位置
		//输出插入后的结果
		System.out.print("插入后的数组为：");
		for(int i = 0; i < newBooks.length; i++){
			System.out.print(newBooks[i]+"  ");
		}
	}
}
