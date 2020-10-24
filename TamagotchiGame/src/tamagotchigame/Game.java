package tamagotchigame;

import outils.Clavier;

public class Game {

	public static void printMenuActions() {

		System.out.println("Menu des actions : \nVoir les informations : 0\nManger : 1");
	}

	public static int demandeActions() {

		int action = Clavier.lireInt();
		return action;
	}

	public static void verifAction() {

		switch (demandeActions()) {

		case 0 : 
			System.out.println(Main.myTama.toString());
			actions();
		case 1 :
			Main.myTama.manger();
			actions();
			break;
		default:
			demandeActions();
			break;
		}
	}
	
	public static void actions() {
		printMenuActions();
		verifAction();
	}
}