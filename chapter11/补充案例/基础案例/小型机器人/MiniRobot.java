public class MiniRobot {
	String name;

	public void introduction() {
		System.out.println("�ҵ����ֽ�" + name);
	}

	public void sing() {
		System.out.println("���������......");
	}

	public static void main(String[] args) {
		MiniRobot mr = new MiniRobot();
		mr.name = "����è";
		mr.introduction();
		// mr.sing();
	}
}
