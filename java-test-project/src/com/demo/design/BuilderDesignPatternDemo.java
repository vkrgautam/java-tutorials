package com.demo.design;

public class BuilderDesignPatternDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new EmployeeBuilder().setEmpId("987654").setFname("John").setLname("Reese").setSalary(100000).build();
		System.out.println(employee1);
		
		Employee employee2 = new EmployeeBuilder().setEmpId("123456").setFname("John").setSalary(80000).build();
		System.out.println(employee2);
		
		Student student1 = new Student.StudentBuilder().setRoll(123).setFname("James").setLname("Walker").setAdm_date("01/01/2008").build();
		System.out.println(student1);
		
		Student student2 = new Student.StudentBuilder().setRoll(123).setFname("James").setAdm_date("01/01/2008").build();
		System.out.println(student2);
	}
}
