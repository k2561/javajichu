package cn.jbit.classandobject;
import java.util.Scanner;
public class Height {

	/**
	 * @param args
	 */
	public Students getMaxHeight(Students[] stu){
		Students maxHeight= new Students();
		
		for(int i=0;i<stu.length ;i++){
			if(stu[i].height >maxHeight.height ){
				maxHeight.height=stu[i].height;
				maxHeight.ID =i+1 ;
			}
		}		
		return maxHeight;
	}
	
	public static void main(String[] args) {
		Students[] s=new Students[10];//����10��ѧ��
		Students maxs=new Students();
		Height h=new Height();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<s.length ;i++){
			System.out.print("�������"+(i+1)+"��ѧ�������:");
			s[i]=new Students();
			s[i].height=input.nextFloat();
			s[i].ID=i+1;
		}
		maxs=h.getMaxHeight(s);
		System.out.print("�ð��"+maxs.ID+"��ѧ�������ߣ�Ϊ"+maxs.height);

	}

}
