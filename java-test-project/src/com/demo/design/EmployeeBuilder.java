package com.demo.design;

public class EmployeeBuilder {

	private String empId;
	private String fname;
	private String lname;
	private int salary;

	public EmployeeBuilder setEmpId(String empId) {
		this.empId = empId;
		return this;
	}

	public EmployeeBuilder setFname(String fname) {
		this.fname = fname;
		return this;
	}

	public EmployeeBuilder setLname(String lname) {
		this.lname = lname;
		return this;
	}

	public EmployeeBuilder setSalary(int salary) {
		this.salary = salary;
		return this;
	}

	public Employee build() {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setFname(fname);
		emp.setLname(lname);
		emp.setSalary(salary);
		return emp;
		// OR return new Employee(empId, fname, lname, salary); // Create parameterized constructor in Employee class
	}
}
