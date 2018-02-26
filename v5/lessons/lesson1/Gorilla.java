package lessons.lesson1;

public class Gorilla extends Animal {

	public Gorilla() {
		this.weight = Math.random() * 60 + 60; // 60-120 kg
	}

	public void makeSound() {
		System.out.println("Harambe");
	}

}
