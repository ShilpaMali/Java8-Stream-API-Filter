package com.test;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.stream().filter(p -> p >=3000)  //2000>3000
		.forEach(y -> System.out.println(y));
	}

}
