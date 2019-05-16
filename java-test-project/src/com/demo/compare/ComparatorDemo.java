package com.demo.compare;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Comparator interface is used to order the objects of a user-defined class and
 * contains 2 methods compare(Object obj1,Object obj2) and equals(Object
 * element). It provides multiple sorting sequences, i.e., you can sort the
 * elements on the basis of any data member.
 * 
 * @author GautamV
 */
public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "John", 23));
		studentList.add(new Student(103, "Chris", 24));
		studentList.add(new Student(104, "Paul", 22));
		studentList.add(new Student(102, "Rob", 25));
		studentList.add(new Student(105, "James", 19));

		Collections.sort(studentList, new AgeComparator());

		for (Student student : studentList) {
			System.out.println(student.getRollno() + " " + student.getName() + " " + student.getAge());
		}
	}
}
