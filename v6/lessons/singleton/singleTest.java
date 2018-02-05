package lessons.singleton;

public class singleTest {

	public static void main(String[] args) {

		MySingleton.getInstance().increaseTest();
		MySingleton.getInstance().increaseTest();		
		MySingleton.getInstance().increaseTest();
		MySingleton.getInstance().increaseTest();
		
		int n1 = MySingleton.getInstance().getTest();
		
		System.out.println(n1);
	}

}
