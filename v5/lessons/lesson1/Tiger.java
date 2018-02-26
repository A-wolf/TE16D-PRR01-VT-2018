package lessons.lesson1;

public class Tiger extends Animal {

	public Tiger() {
		this.weight = Math.random() * 200 + 100; // 100-300
	}

	public void makeSound() {
		System.out.println("Grrrr");
	}

}
