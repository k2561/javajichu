package com.game.guess;
import java.util.Scanner;

/**
 * 游戏类
 * 阶段6：实现对战结果显示
 */
public class Game4 {
    Person person;       //甲方
    Computer computer;   //乙方
    int count;           //对战次数
	
    /**
     * 初始化
     */
    public void initial(){
    	person = new Person();
    	computer = new Computer();
    	count = 0;
    }
		
    /**
     * 开始游戏
     */
	public void startGame() {
		initial();  // 初始化
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println  ("\t\t**  猜拳, 开始    **");
		System.out.println  ("\t\t******************");
		
		System.out.println("\n\n出拳规则：1.剪刀 2.石头 3.布");
		/*选择对方角色*/
		System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）： ");
		Scanner input = new Scanner(System.in);
		int role = input.nextInt();
		if(role == 1){
			computer.name = "刘备";
		}else if(role == 2){
			computer.name = "孙权";
		}else if(role == 3){
			computer.name = "曹操";
		}   
		System.out.println("你选择了 "+computer.name+"对战");
		
		System.out.print("\n要开始吗？（y/n） ");
		String con = input.next();
		int perFist;   //用户出的拳
		int compFist;  //计算机出的拳
		while(con.equals("y")){
	        /*出拳*/
			perFist = person.showFist();
			compFist = computer.showFist();
			/*裁决*/
			if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
				System.out.println("结果:和局,真衰！嘿嘿,等着瞧吧 !\n");  //平局
			}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
				System.out.println("结果： 恭喜， 你赢了！");  //用户赢
				person.score++;
			}else{
				System.out.println("结果说:^_^,你输了，真笨!\n");  //计算机赢
				computer.score++;
			}
			count++;
			System.out.print("\n是否开始下一轮（y/n）:  ");
			con = input.next();
		}
		/*显示结果*/
		showResult();
	}
	
	/**
	 * 显示比赛结果
	 */
	public void showResult(){
		/*显示最后结果*/
		System.out.println("---------------------------------------------------");
		System.out.println(computer.name + "  VS  " + person.name);
		System.out.println("对战次数："+ count);
		
		int result = calcResult();
		if(result == 1){
			System.out.println("结果：打成平手，下次再和你一分高下！");
		}else if(result == 2){
			System.out.println("结果：恭喜恭喜！");   //用户获胜
		}else{ 
			System.out.println("结果：呵呵，笨笨，下次加油啊！");   //计算机获胜
		}
		System.out.println("---------------------------------------------------");
	}
	
	/**
	 * 计算比赛结果
	 * @return 1:战平；2:用户赢；3:电脑赢
	 */
    public int calcResult(){
    	if(person.score == computer.score){
    		  return 1; // 战平
    	}else if(person.score > computer.score){
    		  return 2; // 用户赢
    	}else{
    		  return 3; // 电脑赢
    	}
    	
    }
}
