package cn.jbit.classandobject;
/**
 * Manager��
 * @author xuejie.yu
 * @version 1.0 2010/06/01
 */
public class Manager {
	/**
	 * �û���
	 */
	String username = "JadeBird";  
	/**
	 * ����
	 */
    String password = "0000"; 
    /**
     * ��ʾ�û���������   
     */
    public String show(){
   	 return "����Ա��Ϣ�û���Ϊ ��" + username + "\t����Ϊ��" + password;
    }

}
