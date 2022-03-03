package LambdaExp;

//pre-requisite : that interface should have only one abstract method (SAM - Single Abstract Method)
public interface UserInterface {

	void userData(String name);

	public static void testMethod() {
		System.out.println("testing lambda exp ");
	}
	
}
