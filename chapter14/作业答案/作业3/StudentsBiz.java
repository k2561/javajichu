package cn.jbit.classandobject;
import java.util.*;
import java.util.Arrays;
/**
 * ʵ��ĳ��ѧ����Ϣ�Ĺ��� 
 *
 */
public class StudentsBiz {
	String[] names = new String[5];  // ѧ����������	
	/**
	 * ¼��5��ѧ��������	 
	 */
	public void inputNames(){
		Scanner input = new Scanner(System.in);
		System.out.println("������¼��5��ѧ����������");
		for(int i=0;i<5;i++){
			names[i] = input.next();
		}
	}
	/**
	 * ʾ��1��ѧ����������	
	 * @return �����ѧ����������
	 */
	public String[] getNames(){			
		Arrays.sort(names);
		return names;
	}
	/**
	 * ��ҵ3��ѧ����������	
	 * @return �ҵ����
	 */
	public boolean searchNames(String[] names,String name){			
		boolean flag=false;
		for(int i=0;i<5;i++){
			if(names[i].equals(name)){
				flag=true;
			}
		}
		return flag;
	}
}
