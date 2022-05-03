package Game;

import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ComputerAI computer = new ComputerAI();
		String computerChoose;
		String playerChoose;
		boolean continueGame;
		WinChecker winChecker = new WinChecker();
		do {
			computerChoose = computer.generateRandom();
			System.out.println("Wybierz: Papier, Kamie�, No�yce");
			playerChoose = in.nextLine();
			System.out.println("Komputer wybra� " + computerChoose + ", a ty wybra�o� " + playerChoose);
			winChecker.checking(computerChoose, playerChoose);
			System.out.println("Czy chcesz dalej ze mn� gra�?");
			continueGame = continueGame();
		} while (continueGame);

	}

	private static boolean continueGame() {
		String doYouWantToPlay = in.nextLine();
		if (doYouWantToPlay.equals("Tak")) {
			return true;
		} else {
			return false;
		}
	}
}
