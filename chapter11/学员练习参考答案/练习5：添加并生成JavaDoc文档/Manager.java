package cn.jbit.classandobject;
/**
 * Manager类
 * @author xuejie.yu
 * @version 1.0 2010/06/01
 */
public class Manager {
	/**
	 * 用户名
	 */
	String username = "JadeBird";  
	/**
	 * 密码
	 */
    String password = "0000"; 
    /**
     * 显示用户名和密码   
     */
    public String show(){
   	 return "管理员信息用户名为 ：" + username + "\t密码为：" + password;
    }

}
