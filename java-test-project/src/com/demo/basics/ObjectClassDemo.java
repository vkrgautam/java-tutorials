package com.demo.basics;

/**
 * Object class methods: public boolean equals(Object obj), public int
 * hashCode(), public String toString(), protected Object clone() throws
 * CloneNotSupportedException , protected void finalize() throws Throwable,
 * public final Class getClass(), public final void notify(), public final void
 * notifyAll(), public final void wait()
 * 
 * @author GautamV
 *
 */
public class ObjectClassDemo {

	private int id;
	private String name;
	private int age;

	// getters and setters, constructor

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassDemo other = (ObjectClassDemo) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ObjectClassDemo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
