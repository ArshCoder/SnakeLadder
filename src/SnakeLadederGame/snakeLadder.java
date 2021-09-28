package SnakeLadederGame;

public class snakeLadder {
	public static void main( String args[] ) {
	      int min = 1;
	      int max = 6;
	      
	      int int_random = (int)Math.floor(Math.random()*(max-min+1)+min);  
	      System.out.println("Dice Rolled You Get : " + int_random);
	      }

}
