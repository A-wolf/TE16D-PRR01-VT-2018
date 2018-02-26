package lessons.lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class arrayListRemove {

	/**
	 * This method does the following: <br>
	 * 1. Creates an empty ArrayList with Strings. <br>
	 * 2. Adds a couple of Strings to it. <br>
	 * 3. Prints the ArrayList as an String to the console. <br>
	 * 4. Removes some Strings from the ArrayList. <br>
	 * 5. Prints what is left of the ArrayList as an String to the console. <br>
	 */
	public static void main(String[] args) {

		// 1
		ArrayList<String> stringArrayList = new ArrayList<String>();

		// 2
		stringArrayList.add("toot");
		stringArrayList.add("woof");
		stringArrayList.add("wa");
		stringArrayList.add("ow");
		stringArrayList.add("pa");
		stringArrayList.add("woof");
		stringArrayList.add("pa");
		stringArrayList.add("pa");
		stringArrayList.add("ow");
		stringArrayList.add("pa");
		stringArrayList.add("pa");
		stringArrayList.add("toot");
		stringArrayList.add("woof");
		stringArrayList.add("pow");
		stringArrayList.add("ow");

		// 3
		System.out.println(stringArrayList);

		// 4
		// removes all woof from the ArrayList
		while (stringArrayList.contains("woof")) {
			stringArrayList.remove("woof");
		}
		// removes all ow from the ArrayList
		while (stringArrayList.contains("ow")) {
			stringArrayList.remove("ow");
		}
		// removes all toot from the ArrayList
		while (stringArrayList.contains("toot")) {
			stringArrayList.remove("toot");
		}

		// 5
		System.out.println(stringArrayList);

	}

}
