package cn.jbit.classandobject;

public class Height {
	/**
	 * 示例3：计算平均身高，对象数组作为参数	
	 * @return avgHeight 平均身高
	 */
	public float getAvgHeight(Students[] stu){
		float avgHeight=0;
		float all=0;//所有学生的总身高
		int count=0;//学生计数
		for(int i=0;i<stu.length;i++){
			if(stu[i].height!=0){
				all=all+stu[i].height;
				count++;
			}
		}
		avgHeight=all/count;		
		return avgHeight;
	}
}
