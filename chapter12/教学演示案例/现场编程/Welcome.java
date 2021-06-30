/**
 * 欢迎类
 * @author 北大青鸟
 */
public class Welcome {
	/**
	 * 向用户问好
	 */
	public void sayHello(){
		Scanner input = new Scanner(System.in);
		System.out.print("你叫什么？");
		String name = input.next();
		System.out.println(name + ", 你好！");
	}
}
