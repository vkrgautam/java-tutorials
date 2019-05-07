package com.test.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable interface is used to order the objects of the user-defined class
 * and contains only one method named compareTo(Object). It provides a single
 * sorting sequence only, i.e., you can sort the elements on the basis of single
 * data member only.
 * 
 * @author GautamV
 */
public class ComparableDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(619, "John", "DX"));
		empList.add(new Employee(612, "Don", "DX"));
		empList.add(new Employee(623, "James", "DX"));
		empList.add(new Employee(601, "Ryan", "DX"));
		empList.add(new Employee(602, "Chris", "DX"));

		Collections.sort(empList);

		for (Employee employee : empList) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getUnit());
		}
	}
}
