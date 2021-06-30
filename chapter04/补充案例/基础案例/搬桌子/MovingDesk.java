public class MovingDesk {
	public static void main(String[] args) {
		int age = 5;
		char sex = '女';
		switch (age) {
		  case 1:
		  case 2:
		  case 3:
		  case 4:
			System.out.println("不能搬动桌子");
			break;
		  case 5:
		  case 6:
			switch (sex) {
			  case '男':
				System.out.println("能搬动桌子");
				break;
			  case '女':
				System.out.println("不能搬动桌子");
				break;
			}
			break;
		  case 7:
		  default:
			System.out.println("能搬动桌子");
			break;
		}
	}
}
