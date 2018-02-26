package lessons.lesson1;

public class MySingleton {

	private static MySingleton me;
	private static int instances = 0;
	private int test = 0;
	
	public void increaseTest(){
		test++;
	}
	
	public int getTest(){
		return test;
	}
	
	public int getInstances(){
		return instances;
	}
	
	private MySingleton() {
		instances++;
	}

	public static MySingleton getInstance() {

		if (me == null) {
			me = new MySingleton();
		}

		return me;

	}

	
	
	public void printHello(){
		
		System.out.println("hello");
		
	}
	
	

}
