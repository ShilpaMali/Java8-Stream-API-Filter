package com.velocity.without1;

import java.util.ArrayList;
import java.util.List;

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

		for (int i = 0; i < list.size(); i++) { // 0<5
			if (getChecking(list.get(i).getEmpName())) { // list.get(0)
				System.out.println(list.get(i).getEmpSalary()); // amit
			}
		}

	}

	private static boolean getChecking(String name) {
		// name contain amit
		if (name.startsWith("a")) { // amit.startsWith("a")
			return true;
		} else {
			return false;
		}
	}

}
