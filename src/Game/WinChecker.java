package Game;

public class WinChecker {
	public void checking(String computerChoose, String playerChoose) {
		if (computerChoose.equals("Papier") && playerChoose.equals("Papier")) {
			System.out.println("Jest remis.");
		} else if (computerChoose.equals("Papier") && playerChoose.equals("Kamie�")) {
			System.out.println("Wgra� komputer.");
		} else if (computerChoose.equals("Papier") && playerChoose.equals("No�yce")) {
			System.out.println("Wgra�e�!");
		} else if (computerChoose.equals("Kamie�") && playerChoose.equals("Papier")) {
			System.out.println("Wgra�e�!");
		} else if (computerChoose.equals("Kamie�") && playerChoose.equals("Kamie�")) {
			System.out.println("Jest remis.");
		} else if (computerChoose.equals("Kamie�") && playerChoose.equals("No�yce")) {
			System.out.println("Wgra� komputer.");
		} else if (computerChoose.equals("No�yce") && playerChoose.equals("Papier")) {
			System.out.println("Wgra� komputer.");
		} else if (computerChoose.equals("No�yce") && playerChoose.equals("Kamie�")) {
			System.out.println("Wgra�e�!");
		} else if (computerChoose.equals("No�yce") && playerChoose.equals("No�yce")) {
			System.out.println("Jest remis.");
		} else {
			System.out.println("Wyst�pi� b��d");
		}
	}
}
