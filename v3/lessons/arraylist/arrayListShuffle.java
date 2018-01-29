package lessons.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListShuffle {

	/**
	 * This method does the following: <br>
	 * 1. Creates an empty ArrayList with Integers. <br>
	 * 2. Adds the Integers 0-9 to it. <br>
	 * 3. Prints the original ArrayList as an String to the console. <br>
	 * 4. It then shuffles the ArrayList randomly and prints it 10 times.<br>
	 */
	public static void main(String[] args) {

		// 1
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

		// 2
		integerArrayList.add(0);
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerArrayList.add(4);
		integerArrayList.add(5);
		integerArrayList.add(6);
		integerArrayList.add(7);
		integerArrayList.add(8);
		integerArrayList.add(9);

		// 3
		System.out.println("Original:");
		System.out.println(integerArrayList.toString());

		// 4
		System.out.println("10 Shuffled Lists:");
		for (int i = 0; i < 10; i++) { // Do 10 times:

			// Shuffle
			Collections.shuffle(integerArrayList);

			// Print
			System.out.println(integerArrayList.toString());

		}

	}
}
