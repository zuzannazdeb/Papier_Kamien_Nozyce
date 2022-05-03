package Game;

import java.util.Random;

public class ComputerAI {
	private String[] value = { "Kamieñ", "Papier", "No¿yce" };

	private Random random = new Random();

	public String generateRandom() {
		int n = random.nextInt(3);
		return value[n];
	}
}
