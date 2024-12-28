package com.velocity.without;

import java.util.ArrayList;
import java.util.List;

//without java 8
/*Write a java program to print student names which 
* is starting with A
*/
public class StreamAPI {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("amit"); //0th index
		list.add("vikas"); //1st index
		list.add("suresh"); //2nd index
		list.add("akash"); //3rd index
		list.add("yogesh"); //4th index

		for (int i = 0; i < list.size(); i++) { //0<5
			if (getChecking(list.get(i))) { //list.get(0)
				System.out.println(list.get(i)); //amit
			}
		}
	}

	private static boolean getChecking(String name) {
		//name contain amit
		if (name.startsWith("a")) { //amit.startsWith("a")
			return true;
		} else {
			return false;
		}
	}

}
