package main;

import controller.controllerGame;
import model.modelGame;
import views.mainMenu;

public class Game {

	public static void main(String[] args) {
		modelGame modelg = new modelGame();
		mainMenu mainMenu = new mainMenu();
		new controllerGame(modelg, mainMenu);
	}

}
