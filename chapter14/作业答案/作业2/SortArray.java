package cn.jbit.classandobject;

/**
 * ��ҵ2������������Сֵ������ʹ��sort()
 */
public class SortArray {

	public void MaxMin(int[] nums){		
		// ��������
		int max=nums[0];
		for (int i=1;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}
		}
		System.out.println("�������:"+max);
		// �����С��
		int min=nums[0];
		for (int i=1;i<nums.length;i++){
			if(nums[i]<min){
				min=nums[i];
			}
		}
		System.out.println("��С����:"+min);
	}
	
	public static void main(String[] args) {
		SortArray sa=new SortArray();
		int user[]= new int[10];  // ������ֵ�����
		// �������10�����ִ����������
		System.out.println("������10�������:");
		for(int i=0;i<user.length;i++){
			user[i]=(int)(Math.random()*1000);
			System.out.println(user[i]);
		}
		sa.MaxMin(user);
	}

}
