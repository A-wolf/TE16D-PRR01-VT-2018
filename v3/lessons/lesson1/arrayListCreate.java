package lessons.lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListCreate {

	/**
	 * This method does the following: <br>
	 * 1. Creates an empty ArrayList with Strings. <br>
	 * 2. Adds a couple of Strings to it. <br>
	 * 3. Prints the whole ArrayList as an String to the console. <br>
	 */
	public static void main(String[] args) {

		// 1
		ArrayList<String> stringArrayList = new ArrayList<String>();

		// 2
		stringArrayList.add("Hej");
		stringArrayList.add("jag");
		stringArrayList.add("heter");
		stringArrayList.add("Joakim");
		stringArrayList.add(".");

		// 3
		System.out.println(stringArrayList.toString());

	}

}
