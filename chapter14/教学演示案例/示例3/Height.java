package cn.jbit.classandobject;

public class Height {
	/**
	 * ʾ��3������ƽ����ߣ�����������Ϊ����	
	 * @return avgHeight ƽ�����
	 */
	public float getAvgHeight(Students[] stu){
		float avgHeight=0;
		float all=0;//����ѧ���������
		int count=0;//ѧ������
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
