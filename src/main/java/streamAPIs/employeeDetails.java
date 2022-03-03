package streamAPIs;

import java.util.Arrays;
import java.util.List;

public class employeeDetails {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Vaibhav", "Chaitanya", "Madhu", "Rutuja", "Aakash", "Swati");

		// names.forEach(System.out::println);

		/*
		 * for(String name:names) { System.out.println(name.length()); }
		 */

		// names.stream().map(str -> str.length()).forEach(System.out::println);

		/*
		 * for (String name : names) { System.out.println(name.toUpperCase()); }
		 */
		//names.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		
		
		//names.stream().sorted().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,4,6,2,7,-1,0,-5,9);
		
		//numbers.stream().sorted().forEach(System.out::println);
		Integer num = numbers.stream().filter(n -> n.equals(3))
		.findAny()
		.orElse(null);
		System.out.println(num);
		
	}
}
