package com.velocity.without.filter;

import java.util.ArrayList;
import java.util.List;

//using java 8
/*write a java program to print employee salary
*  whose name is starts with A
*/
public class Test {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "ankit", 45000));
		list.add(new Employee(102, "vishal", 50000));
		list.add(new Employee(103, "yogesh", 55000));
		list.add(new Employee(104, "ganesh", 30000));
		list.add(new Employee(105, "sandip", 60000));
		list.stream().filter(e -> e.getEmpName().startsWith("a"))
		.forEach(s -> System.out.println(s.getEmpSalary()));
	}

}
