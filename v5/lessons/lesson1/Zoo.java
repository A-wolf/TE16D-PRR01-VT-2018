package lessons.zoo;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {

	public ArrayList<Animal> animals = new ArrayList<Animal>();	
	
	public Zoo() {

		// Generate 6 random numbers between 1-10:
		Random r = new Random();
		int numberOfGorillas = r.nextInt(10) + 1;
		int numberOfKiwis = r.nextInt(10) + 1;
		int numberOfLions = r.nextInt(10) + 1;
		int numberOfTigers = r.nextInt(10) + 1;
		int numberOfOrangutans = r.nextInt(10) + 1;
		int numberOfParrots = r.nextInt(10) + 1;

		// Create new Animals and add to the Zoo
		for (int i = 0; i < numberOfGorillas; i++) {
			animals.add(new Gorilla());
		}

		for (int i = 0; i < numberOfKiwis; i++) {
			animals.add(new Kiwi());
		}

		for (int i = 0; i < numberOfLions; i++) {
			animals.add(new Lion());
		}

		for (int i = 0; i < numberOfTigers; i++) {
			animals.add(new Tiger());
		}

		for (int i = 0; i < numberOfOrangutans; i++) {
			animals.add(new Orangutan());
		}

		for (int i = 0; i < numberOfParrots; i++) {
			animals.add(new Parrot());
		}

	}

	public void makeSounds() {

		for (Animal animal : animals) {
			animal.makeSound();
		}

	}

}
