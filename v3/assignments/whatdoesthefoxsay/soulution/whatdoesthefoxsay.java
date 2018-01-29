package assignments.whatdoesthefoxsay.soulution;

import java.util.*;

public class whatdoesthefoxsay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cases; i++) {
			ArrayList<String> sounds = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));

			String sound = sc.nextLine();
			while (!sound.equals("what does the fox say?")) {

				sound = sound.split(" ")[2];

				while (sounds.contains(sound)) {
					sounds.remove(sound);
				}

				sound = sc.nextLine();

			}

			for (String s : sounds) {
				System.out.print(s + " ");
			}

		}

		sc.close();

	}

}
