package com.velocity.with;

import java.util.ArrayList;
import java.util.List;


//with java 8
/*Write a java program to print student names which 
 * is starting with A
 */
public class StreamAPI {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("amit"); // 0th index
		list.add("vikas"); // 1st index
		list.add("suresh"); // 2nd index
		list.add("akash"); // 3rd index
		list.add("yogesh"); // 4th index
		list.stream().filter((p) -> p.startsWith("s")) 
		//amit.startswith("a")
		//p means generic type
		//s means variable name
		//list means collection object
		.forEach(s -> System.out.println(s));
	}

}
