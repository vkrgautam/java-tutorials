package com.demo.compare;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String unit;

	public Employee(int id, String name, String unit) {
		this.id = id;
		this.name = name;
		this.unit = unit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	/*
	 * @Override public int compareTo(Employee emp) { if(this.empId ==
	 * emp.getEmpId()) { return 0; } else return this.empId > emp.getEmpId() ? 1 :
	 * -1; }
	 */

	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.getName());
	}
}
