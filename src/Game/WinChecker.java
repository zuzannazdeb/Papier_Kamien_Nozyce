package Game;

public class WinChecker {
	public void checking(String computerChoose, String playerChoose) {
		if (computerChoose.equals("Papier") && playerChoose.equals("Papier")) {
			System.out.println("Jest remis.");
		} else if (computerChoose.equals("Papier") && playerChoose.equals("Kamieñ")) {
			System.out.println("Wgra³ komputer.");
		} else if (computerChoose.equals("Papier") && playerChoose.equals("No¿yce")) {
			System.out.println("Wgra³eœ!");
		} else if (computerChoose.equals("Kamieñ") && playerChoose.equals("Papier")) {
			System.out.println("Wgra³eœ!");
		} else if (computerChoose.equals("Kamieñ") && playerChoose.equals("Kamieñ")) {
			System.out.println("Jest remis.");
		} else if (computerChoose.equals("Kamieñ") && playerChoose.equals("No¿yce")) {
			System.out.println("Wgra³ komputer.");
		} else if (computerChoose.equals("No¿yce") && playerChoose.equals("Papier")) {
			System.out.println("Wgra³ komputer.");
		} else if (computerChoose.equals("No¿yce") && playerChoose.equals("Kamieñ")) {
			System.out.println("Wgra³eœ!");
		} else if (computerChoose.equals("No¿yce") && playerChoose.equals("No¿yce")) {
			System.out.println("Jest remis.");
		} else {
			System.out.println("Wyst¹pi³ b³¹d");
		}
	}
}
