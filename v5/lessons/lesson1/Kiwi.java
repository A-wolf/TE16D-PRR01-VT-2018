package lessons.lesson1;

public class Kiwi extends Bird {

	public Kiwi() {
		this.weight = Math.random() * 0.1 + 0.01; // 0.01-0.11
	}

	public void makeSound() {
		System.out.println("Piip");
	}

}
