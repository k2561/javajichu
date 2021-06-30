package com.game.guess;
import java.util.Scanner;

/**
 * 游戏类
 */
public class Game1 {
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
		initial();
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
		
		System.out.print("你选择了"+computer.name+"对战");
	}
}
