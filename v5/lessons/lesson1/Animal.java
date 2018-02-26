package lessons.lesson1;

public abstract class Animal {

	public double weight;

	public abstract void makeSound();

	public void jump() {
		System.out.println( "The " + getAnimalName() + " jumped");
	}
	
	public String getAnimalName(){
		return this.getClass().getSimpleName();
	}

}
