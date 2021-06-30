package cn.jbit.classandobject;
/**
 * 
 * 实现学生信息的管理 
 *
 */
public class StudentsBiz {
	String[] names = new String[30];  // 学员姓名数组
	
	/**
	 * 示例1：增加学生姓名
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
	 * 显示本班的学生姓名
	 */
	public void showNames(){
		System.out.println("本班学生列表：");
		for(int i =0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
	
	/**
	 * 示例3：修改学员姓名
	 * @param oldName旧名字
	 * @param newName新名字
	 */
	public boolean editName(String oldName,String newName){
		boolean find = false;  // 是否找到并修改成功标识
		
		// 循环数组，找到姓名为oldName的元素，修改为newName
		for(int i=0;i<names.length;i++){
			if(names[i].equals(oldName)){
				names[i] = newName;
				find=true;
				break;
			}
		}
		return find;
	}
}
