package LambdaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpWithList {
	
	public static void main(String[] args) {
		
	List<String> names = Arrays.asList("Vaibhav", "Chaitanya","Madhu", "Rutuja", "Aakash","Swati");
	System.out.println(names);
	
	System.out.println("=========================");
	
	for(int i=0; i<names.size();i++) {
		System.out.println(names.get(i));
	}
	
	System.out.println("===========for each=============");
	
	for(String name :names) {
		System.out.println(name);
	}
	
	System.out.println("=============lambda exp==============");
	
	//lambda exp
	names.forEach(abc -> System.out.println(abc));
	
	System.out.println("====================method ref=================");
	
	//method references
	names.forEach(System.out::println);
	
	}
	
}
