package cn.jbit.classandobject;

public class InitialAdministrator {

	public static void main(String[] args) {
		Administrator admin = new Administrator();	//创建管理员对象
		admin.name = "admin1";						//给name属性赋值
		admin.password = "111111";					//给password属性赋值
		admin.show();								//调用方法
	}
}
