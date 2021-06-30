package cn.jbit.classandobject;

/**
 * 上机阶段1：实现客户姓名显示和添加 
 *
 */
public class CustomerBiz {
	String[] names = new String[30];  // 姓名数组	
	
	/**
	 * 增加姓名
	 * @param name要增加的姓名
	 */
	public void addName(String name){
		for(int i =0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	/**
	 * 显示姓名
	 */
	public void showNames(){
		System.out.println("**************************");
		System.out.println("\t客户姓名列表：");
		System.out.println("**************************");
		for(int i =0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
}
