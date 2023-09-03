
package edu.dandaevit.jdbc_mysql.MySQL_JDBC_project;


import java.util.Objects;


public class Employee {

	private String name;
	private String e_mail;
	private int userd_id;
	private int age;

	@ Override
	public String toString() {
		return "Employee {\n\tname: " + name + "\n\te_mail: " + e_mail + "\n\tuserd_id: " + userd_id + "\n\tage: " + age
		        + "\n}";
	}


	// Initialization of fields with default values."
	public Employee () {
		this.name		= null;
		this.e_mail		= null;
		this.userd_id	= - 1;
		this.age		= - 1;
	}


	public Employee (int age, String name, int userd_id, String e_mail) {
		this.name		= name;
		this.e_mail		= e_mail;
		this.userd_id	= userd_id;
		this.age		= age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getE_mail() {
		return e_mail;
	}


	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}


	public int getUserd_id() {
		return userd_id;
	}


	public void setUserd_id(int userd_id) {
		this.userd_id = userd_id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@ Override
	public int hashCode() {
		return Objects.hash (age, e_mail, name, userd_id);
	}


	@ Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass () != obj.getClass ())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals (e_mail, other.e_mail) && Objects.equals (name, other.name)
		        && userd_id == other.userd_id;
	}

}
