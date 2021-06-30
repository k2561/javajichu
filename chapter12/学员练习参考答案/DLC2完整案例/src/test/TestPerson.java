package test;

import com.game.guess.Person;

/**
 * 人机互动版猜拳游戏
 * 阶段1：测试用户出拳
 * 
 */
public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.showFist());
	}
}
