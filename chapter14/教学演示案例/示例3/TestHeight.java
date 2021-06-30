package cn.jbit.classandobject;
import java.util.Scanner;
public class TestHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Students[] stu = new Students[5];//定义包含5个元素的学生对象数组
		Height h=new Height();
		Scanner input = new Scanner(System.in);

		for(int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"名学生的身高（cm）：");
			stu[i]=new Students();//实例化
			stu[i].height = input.nextFloat();			
		}
		float avgheight=h.getAvgHeight(stu);//调用方法，传递对象数组
		System.out.println("***这5名学生的平均身高为："+avgheight+"cm***");
	}
}
