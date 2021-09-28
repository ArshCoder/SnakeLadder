package SnakeLadederGame;

public class snakeLadder {
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;

	public static void main(String[] args) {

		int player = 0;
		while (player < 100)
			;
		int count = 0;

		int option = (int) (Math.random() * 3);
		int diceRoll = (int) (Math.random() * 6 + 1);
		System.out.println("Dice Rolled You Get : " + diceRoll);

		if (option == LADDER) {
			player += diceRoll;
			if (player > 100)
				player = player - diceRoll;

		} else if (option == SNAKE) {
			player -= diceRoll;

		} else if (option == NO_PLAY) {
			player += diceRoll;
			;
			if (player < 0) {
				player = 0;

			}

			count++;
			System.out.println("Count the number of times dice roll" + count);

		}

	}

}
