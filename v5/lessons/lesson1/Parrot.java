package lessons.zoo;

public class Parrot extends Bird {

	public Parrot() {
		this.weight = Math.random() * 1 + 0.5; // 0.5-1.5
	}

	public void makeSound() {
		System.out.println("Kaka");
	}

}
