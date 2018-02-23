package lessons.singleton;

public class playHangman {

	public static void main(String[] args) {

		HangmanGame game = HangmanGame.getInstance();
		game.start();

	}

}
