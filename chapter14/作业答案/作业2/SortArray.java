package cn.jbit.classandobject;

/**
 * 作业2：数组的最大最小值，不能使用sort()
 */
public class SortArray {

	public void MaxMin(int[] nums){		
		// 求出最大数
		int max=nums[0];
		for (int i=1;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}
		}
		System.out.println("最大数是:"+max);
		// 求出最小数
		int min=nums[0];
		for (int i=1;i<nums.length;i++){
			if(nums[i]<min){
				min=nums[i];
			}
		}
		System.out.println("最小数是:"+min);
	}
	
	public static void main(String[] args) {
		SortArray sa=new SortArray();
		int user[]= new int[10];  // 存放数字的数组
		// 随机产生10个数字存放在数组中
		System.out.println("产生的10个随机数:");
		for(int i=0;i<user.length;i++){
			user[i]=(int)(Math.random()*1000);
			System.out.println(user[i]);
		}
		sa.MaxMin(user);
	}

}
