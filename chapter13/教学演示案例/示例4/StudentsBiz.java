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
	/**
	 * 示例4：在一定区间查找学生姓名
	 * @param start 开始位置
	 * @param end 结束位置
	 * @param name 查找的姓名
	 * @return find 是否查找成功
	 */
	public boolean searchName(int start,int end,String name){
		boolean find = false;  // 是否找到标识
		
		// 指定区间数组中，查找姓名
		for(int i=start-1;i<end;i++){
			if(names[i].equals(name)){				
				find=true;
				break;
			}
		}
		return find;
	}
}
