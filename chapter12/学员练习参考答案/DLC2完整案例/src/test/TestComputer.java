package test;

import com.game.guess.Computer;

/**
 * 人机互动版猜拳游戏
 * 阶段2：测试电脑出拳 
 */
public class TestComputer {
	public static void main(String[] args) {
		Computer computer = new Computer();
		System.out.println(computer.showFist());
	}
}
