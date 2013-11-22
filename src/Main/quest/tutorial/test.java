package Main.quest.tutorial;

import Main.Game;
import Main.quest.Quest;

public class test extends Quest{

	public test(String name, String desc, int xpReward, String reward, String imagePath) {
		super(name, desc, xpReward, reward, imagePath);
	}
	
	public void isSelected() {

	}
	
	public void isComplete() {
		if (Game.key.key.get(12)) {
			onComplete();
		}
	}
	

}
