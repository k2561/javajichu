import java.util.*;
public class Search {

	public static void main(String[] args) {
		String name[] = new String[10];
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("请录入学员姓名：");
		
		for(i = 0; i < 10; i++){     //循环录入
			name[i] = input.next();
		}
		System.out.print("请输入要查找的学员姓名： ");
		String search =  input.next();
		for(i = 0; i < 10; i++){    //循环查找
			if(name[i].equals(search)){   //查找到退出并记录当前下标
				break;
			}
		}
		if(i<10){
			System.out.println("该学员在此班！");
		}else{
			System.out.println("没有找到！");
		}

	}

}
