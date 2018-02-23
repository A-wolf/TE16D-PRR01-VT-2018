package lessons.singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {

	private static HangmanGame __ME;

	private String secretWord;
	private static String[] words = { "TEST", "TIO", "TUSEN" };
	private ArrayList<Character> guesses = new ArrayList<Character>();
	private Scanner input = new Scanner(System.in);

	private HangmanGame() {
		System.out.println("Welcome to Hangman!");
	}

	private void newGame() {
		
		choseRandomWord();
		guesses.clear();
		guesses.add(' ');
		promptInput();
		
		
	}

	private String getSecretWord() {
		
		return secretWord;
		
	}

	private void win() {

	}

	private void choseRandomWord() {

		secretWord = words[(int) (Math.random() * words.length)];
		
	}

	public static HangmanGame getInstance() {

		if (__ME == null) {
			__ME = new HangmanGame();
		}

		return __ME;

	}

	private void promptInput() {
		
		String line = input.nextLine();
		
		if(line.toUpperCase().equals(secretWord)){
			win();
		}
		else{
			makeGuess(line.charAt(0));
		}
		
	}
	
	private void makeGuess(char c){
		
		c = Character.toUpperCase(c);
		
		while(guesses.contains(c)){
			
			System.out.println("You've already guessed on the letter " + c);
			System.out.print("Pleace guess on another letter: ");
			c = input.nextLine().charAt(0);
			c = Character.toUpperCase(c);
			
		}

		processGuess(c);
		
	}

	private void processGuess(char guess) {

		boolean correct = false;
		String out = "";
		for(char letter : secretWord.toCharArray()){
			if(letter == guess){
				correct = true;
				out += letter;
			}
			else if(guesses.contains(letter)){
				out += letter;
			}
			else{
				out += '-';
			}
			
		}

		guesses.add(guess);

		if(!correct){
			Hangman.getInstance().loseLife();
		}
		
		Hangman.getInstance().print();
		System.out.println(out);
		promptInput();
		
	}

	public void gameOver() {
		newGame();
	}

	public void start() {
		newGame();
	}

}
