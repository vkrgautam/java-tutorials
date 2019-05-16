package com.demo.design;

public class Student {

	private int roll;
	private String fname;
	private String lname;
	private String adm_date;

	public static class StudentBuilder {
		private int roll;
		private String fname;
		private String lname;
		private String adm_date;

		public StudentBuilder setRoll(int roll) {
			this.roll = roll;
			return this;
		}

		public StudentBuilder setFname(String fname) {
			this.fname = fname;
			return this;
		}

		public StudentBuilder setLname(String lname) {
			this.lname = lname;
			return this;
		}

		public StudentBuilder setAdm_date(String adm_date) {
			this.adm_date = adm_date;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

	public Student(StudentBuilder builder) {
		this.roll = builder.roll;
		this.fname = builder.fname;
		this.lname = builder.lname;
		this.adm_date = builder.adm_date;
	}

	public int getRoll() {
		return roll;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getAdm_date() {
		return adm_date;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", fname=" + fname + ", lname=" + lname + ", adm_date=" + adm_date + "]";
	}

}
