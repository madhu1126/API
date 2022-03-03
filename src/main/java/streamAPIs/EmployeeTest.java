package streamAPIs;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> employeeDetails= Arrays.asList(new Employee("Chaitanya", 23),
				new Employee("Nikhil", 24),
				new Employee("madhu", 25),
				new Employee("Rutuja", 26),
				new Employee("Budha", 28));
		
		/*
		 * Employee emp =employeeDetails.stream().filter(str ->
		 * "Aakash".equals(str.getName())) .findAny() .orElse(null);
		 */
		
		//System.out.println("Name : "+emp.getName()+" "+"Age :"+emp.getAge());
		//System.out.println(emp);
		
		Employee emp =employeeDetails.stream().filter(str -> "madhu".equals(str.getName()) && 26 == str.getAge())
				.findAny()
				.orElse(null);
		
		//System.out.println("Name : "+emp.getName()+" "+"Age :"+emp.getAge());
		System.out.println(emp);
	}
}
 