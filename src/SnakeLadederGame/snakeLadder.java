package SnakeLadederGame;

public class snakeLadder {
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;

	public static void main(String[] args) {

		int startposition = 0;
		while (startposition < 100)
			;

		int option = (int) Math.floor(Math.floor(Math.random() * 10) % 3);
		int diceRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice Rolled You Get : " + diceRoll);

		if (option == LADDER) {
			startposition += diceRoll;
			System.out.println("You got ladder" + startposition);
		} else if (option == SNAKE) {
			startposition -= diceRoll;
			System.out.println("You Bitten By Snake " + startposition);
		} else if (option == NO_PLAY) {
			startposition += diceRoll;
			System.out.println("No Play for You " + startposition);
			if (startposition < 0) {
				startposition = 0;
				System.out.println("Player at StartPosition" + startposition);
			}

		}

	}
}
