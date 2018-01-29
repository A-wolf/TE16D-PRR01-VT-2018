package lessons.zoo;

public class Lion extends Animal {

	public Lion() {
		this.weight = Math.random() * 100 + 100; // 100-200
	}

	public void makeSound() {
		System.out.println("Jag r ett lejon");
	}

}
