package cn.jbit.classandobject;

/**
 * 上机阶段1、2：实现客户姓名显示和添加、查找 
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
	/**
	 * 阶段2：查找
	 * @param name要查找的姓名
	 * @return 是否找到
	 */
	public boolean search(String name){
		boolean find = false;  // 代表是否找到
		int i=0;
		while(names[i] != null){
			if(names[i].equals(name)){
				find = true;  // 找到了]
				break;
			}
			i++;
		}
		return find;
	}	
}
