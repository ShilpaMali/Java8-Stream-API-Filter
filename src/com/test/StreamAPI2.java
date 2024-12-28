package com.test;

import java.util.ArrayList;
import java.util.List;

//Program for even number
public class StreamAPI2 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(10);
		list.add(11);
		list.add(15);
		list.add(16);
		list.stream().filter(p -> p%2==0).forEach(y -> System.out.println(y));
	}

}
