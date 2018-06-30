/*
 * @(#)Student.java         29/06/18
 * This file contains student class
 */

package com.epam.week2;

/**
 * Student class contains student properties which are private.
 * all setter and getter methods are defined.
 * We can access the student properties using setter and getter methods only.
 */
public class Student {

	/**
	 * Student id.
	 */
	private String id;

	/**
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

	/**
	 * Student year, Class of the student
	 */
	private String year;

	/**
	 * This constructor used to initialize the student parameters.
	 * @param id  student id
	 * @param firstName student first name
	 * @param lastName student last name
	 * @param departmentName student department name
	 */
	public Student(String id, String firstName, String lastName, String departmentName, String year) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.year = year;
	}

	/**
	 * @return id student id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * sets id.
	 * @param id student id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return firstName student first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * sets firstName which is an instance variable.
	 * @param firstName student first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName last name of the student
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * sets LastName which is an instance variable.
	 * @param lastName student last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return DepartmentName department name of student
	 */
	public String getDepartmentName() {
		return this.departmentName;
	}

	/**
	 * sets DepartmentName which is an instance variable.
	 * @param departmentName student department name
	 */
	public void setDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return student year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * sets year which is an instance variable.
	 * @param year student class
	 */
	public void setYear(String year) {
		this.year = year;
	}




}
