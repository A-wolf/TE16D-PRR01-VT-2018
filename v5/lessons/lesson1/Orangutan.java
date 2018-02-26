package lessons.lesson1;

public class Orangutan extends Animal {

	public Orangutan() {
		this.weight = Math.random() * 50 + 100; // 100-150
	}

	public void makeSound() {
		System.out.println("Oh ah ah");
	}

}
