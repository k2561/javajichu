package cn.jbit.classandobject;
/*
 * AutoLion.java
 * 电动玩具类
 */
public class AutoLion {
	String color = "黄色"; // 颜色

	/*
	 * 跑
	 */
	public void run() {
		System.out.println("正在以0.1米/秒的速度向前奔跑。");
	}

	/*
	 * 叫
	 */
	public String bark() {
		String sound = "大声吼叫";
		return sound;
	}

	/*
	 * 获得颜色
	 */
	public String getColor() {
		return color;
	}

	/*
	 * 显示狮子特性
	 */
	public String showLion() {	
		 return "这是一个" + getColor() + "的玩具狮子!";		
		// 另一种方式		
		//return "这是一个" + color + "的玩具狮子!";
	}
}
