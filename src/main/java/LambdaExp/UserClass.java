package LambdaExp;

public class UserClass {

	public static void main(String[] args) {
		
		UserInterface usr = (userName) ->  System.out.println("Hi "+userName);
		
		usr.userData("Madhu");
		
		UserInterface usrVaibhav = (n) ->  System.out.println("Hi "+n);
		usrVaibhav.userData("Vaibhav");
		
	}
}
