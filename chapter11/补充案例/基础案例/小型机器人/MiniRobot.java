public class MiniRobot {
	String name;

	public void introduction() {
		System.out.println("我的名字叫" + name);
	}

	public void sing() {
		System.out.println("天天好心情......");
	}

	public static void main(String[] args) {
		MiniRobot mr = new MiniRobot();
		mr.name = "机器猫";
		mr.introduction();
		// mr.sing();
	}
}
