package cn.jbit.classandobject;
import java.util.*;
import java.util.Arrays;
/**
 * 实现某班学生信息的管理 
 *
 */
public class StudentsBiz {
	String[] names = new String[5];  // 学生姓名数组	
	/**
	 * 录入5个学生的姓名	 
	 */
	public void inputNames(){
		Scanner input = new Scanner(System.in);
		System.out.println("请依次录入5个学生的姓名：");
		for(int i=0;i<5;i++){
			names[i] = input.next();
		}
	}
	/**
	 * 示例1：学生姓名排序	
	 * @return 排序后学生姓名数组
	 */
	public String[] getNames(){			
		Arrays.sort(names);
		return names;
	}
}
