package SnakeLadederGame;

public class snakeLadder {
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;

	public static void main(String[] args) {

		int player = 0;
		int player1 = 0;
		int player2 = 0;
		while (player1 < 100 && player2 < 100)
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
			if (count % 2 == 0) {
				player1 = player;
				System.out.println("Player1 position" + player1);
			} else {
				player2 = player;
				System.out.println("Player2 position" + player2);
			}
			count++;
			System.out.println("Player cuurent position is" + player);
		}
		System.out.println("Number of times dice played: " + player);
		System.out.println("Position" + player);

	}

}
