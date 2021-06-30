package Demo;    						//声明包
import cn.jbit.classandobject.AccpSchool; 	//导入包
public class HelloAccp {
	/**
	 * 示例6：包测试
	 * 
	 */
	public static void main(String[] args) {
		AccpSchool center = new AccpSchool();
		center.showMessage();   		//使用AccpSchool类的方法
	}
}

