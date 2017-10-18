
// Rolls a 6 sided dice

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Dice d = new Dice();

		d.rollDice();

	}

	private int value;

	public Dice() {
	}

	public void rollDice() {
		Random r = new Random();
		this.value = r.nextInt(6) + 1;
	}

	public int getValue() {
		return this.value;
	}

}
