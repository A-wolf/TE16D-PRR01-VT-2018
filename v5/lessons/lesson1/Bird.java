package lessons.lesson1;

public abstract class Bird extends Animal{

	public void jump(){
		fly();
	}
	
	public void fly(){
		System.out.println( "The " + getAnimalName() + " flew away...");
	}
	
	
	

}
