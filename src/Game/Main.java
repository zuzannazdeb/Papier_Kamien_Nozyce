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
			System.out.println("Wybierz: Papier, Kamieñ, No¿yce");
			playerChoose = in.nextLine();
			System.out.println("Komputer wybra³ " + computerChoose + ", a ty wybra³oœ " + playerChoose);
			winChecker.checking(computerChoose, playerChoose);
			System.out.println("Czy chcesz dalej ze mn¹ graæ?");
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
