package lessons.singleton;

import java.util.Scanner;

public class Hangman {

	private static Hangman __ME;
	
	private int lives;

	private Hangman() {
		lives = 10;
		
		
	}
	
	public static Hangman getInstance(){
		
		if(__ME == null){
			__ME = new Hangman();
		}
		
		return __ME;
	}

	public void loseLife() {
		lives--;
	}

	public void print() {
	    System.out.flush();  
		switch (lives) {
		case 10:
			tenLives();
			break;
		case 9:
			nineLives();
			break;
		case 8:
			eightLives();
			break;
		case 7:
			sevenLives();
			break;
		case 6:
			sixLives();
			break;
		case 5:
			fiveLives();
			break;
		case 4:
			fourLives();
			break;
		case 3:
			threeLives();
			break;
		case 2:
			twoLives();
			break;
		case 1:
			oneLife();
			break;
		default:
		case 0:
			dead();
			break;

		}

	}

	private void dead() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        X ");
		System.out.println("   |        /|\\");
		System.out.println("   |        / \\");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
		HangmanGame.getInstance().gameOver();
		__ME = new Hangman();
}

	private void oneLife() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        0 ");
		System.out.println("   |        /|\\");
		System.out.println("   |        /  ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void twoLives() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        0 ");
		System.out.println("   |        /|\\");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
}

	private void threeLives() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        0 ");
		System.out.println("   |        /| ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void fourLives() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        0 ");
		System.out.println("   |         | ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void fiveLives() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/        0 ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void sixLives() {
		System.out.println("   ___________ ");
		System.out.println("   | /       | ");
		System.out.println("   |/          ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}
	
	private void sevenLives() {
		System.out.println("   ___________ ");
		System.out.println("   | /         ");
		System.out.println("   |/          ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void eightLives() {
		System.out.println("   ___________ ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void nineLives() {
		System.out.println("               ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println("   |           ");
		System.out.println(" __|__         ");
		System.out.println("/     \\       ");
	}

	private void tenLives() {
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("               ");
		System.out.println(" _____         ");
		System.out.println("/     \\       ");
	}

}
