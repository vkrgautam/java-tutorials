package com.demo.file;

import java.io.IOException;

public class SerializableDemo {

	public static void main(String[] args) {

		String fileName = "employee.ser";
		Employee emp = new Employee();
		emp.setId(601901);
		emp.setName("James");
		emp.setSalary(8000);

		// serialize to file
		try {
			SerializationUtil.serialize(emp, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Employee empNew = null;
		try {
			empNew = (Employee) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		System.out.println("emp Object:: " + emp);
		/**
		 * Since salary is a transient variable, it’s value was not saved to file and
		 * hence will not be retrieved in the new object. Similarly static variable
		 * values are also not serialized since they belongs to class and not object.
		 */
		System.out.println("empNew Object:: " + empNew);
	}
}
