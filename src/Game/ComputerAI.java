package Game;

import java.util.Random;

public class ComputerAI {
	private String[] value = { "Kamie�", "Papier", "No�yce" };

	private Random random = new Random();

	public String generateRandom() {
		int n = random.nextInt(3);
		return value[n];
	}
}
