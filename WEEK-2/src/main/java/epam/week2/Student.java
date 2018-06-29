/**
 * This file contains Student Class
 */

package epam.week2;

/**
 * Student class contains student properties which are private.
 * We can access the student properties using setter and getter methods only.
 */
public class Student {
	/*
	 * Student id.
	 */
	private String id;
	/*
	 * Student first name
	 */
	private String firstName;
	/**
	 * Student last name
	 */
	private String lastName;
	/**
	 * Student department name
	 */
	private String departmentName;
	public Student(String id,String firstName,String lastName,String departmentName) {
		this.id = id ;
		this.firstName = firstName ;
		this.lastName = lastName;
		this.departmentName = departmentName;
	}

	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getDepartmentName(){
		return this.departmentName;
	}

	public void setDepartment(String departmentName){
		this.departmentName = departmentName;
	}




}
