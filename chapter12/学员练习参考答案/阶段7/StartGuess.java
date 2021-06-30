package test;

import com.game.guess.Game;

/**
 * 人机互动版猜拳游戏 
 * 程序入口
 */
public class StartGuess {
	public static void main(String[] args) {
		Game game = new Game();
		game.startGame();
	}
}
