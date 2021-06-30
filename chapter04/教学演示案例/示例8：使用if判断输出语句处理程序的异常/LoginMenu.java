import java.util.Scanner;
public class LoginMenu {
	public static void main(String[] args) {
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统1.0版\n");
		System.out.println("\t\t\t 1. 登 录 系 统\n");
		System.out.println("\t\t\t 2. 退 出\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");

		/* 从键盘获取信息，并执行相应操作---新加代码 */
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt()==true){
			int num = input.nextInt();
			switch (num) {
			  case 1:
			    //省略
			    break;
			  case 2:
			    /* 退出系统 */
			    System.out.println("谢谢您的使用！");
			    break;
			  default:
			    System.out.println("输入错误。");
			    break;
			}
		}else{
			System.out.println("请输入正确的数字！");
		}
	}
}
