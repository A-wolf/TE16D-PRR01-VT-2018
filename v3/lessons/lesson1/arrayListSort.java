package lessons.lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListSort {

	/**
	 * This method does the following: <br>
	 * 1. Creates an empty ArrayList with Integers. <br>
	 * 2. Adds a couple of Integers to it. <br>
	 * 3. Prints the ArrayList as an String to the console. <br>
	 * 4. Sorts the ArrayList automatically. <br>
	 * 5. Prints the sorted ArrayList as an String to the console.<br>
	 */
	public static void main(String[] args) {

		// 1
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

		// 2
		integerArrayList.add(5);
		integerArrayList.add(6);
		integerArrayList.add(9);
		integerArrayList.add(1);
		integerArrayList.add(-2);
		integerArrayList.add(25);
		integerArrayList.add(-37);

		// 3
		System.out.println("Not sorted:");
		System.out.println(integerArrayList.toString());

		// 4
		Collections.sort(integerArrayList);

		// 5
		System.out.println("Sorted:");
		System.out.println(integerArrayList.toString());

	}
}
