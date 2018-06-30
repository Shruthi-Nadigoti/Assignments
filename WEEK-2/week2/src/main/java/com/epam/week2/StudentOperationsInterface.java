/*
 *  @(#)StudentOperationsInterface.java         29/06/18
 */
package com.epam.week2;

import java.util.ArrayList;

/**
 * Contains set of method declarations which should be contained by extended subclass.
 * @author SURATHI
 *
 */

public interface StudentOperationsInterface {

	/**
	 * Sort the student array according to user choice.
	 * @param column given by user to sort the array accordingly
	 * @return student sorted array list
	 */

	public ArrayList<Student> sortStudentArray(int column);

	/**
	 * Gives the which matches with the search string.
	 * @param searchString any string given by user
	 * @return resulted student list
	 */
	public ArrayList<Student> searchStudent(String searchString);

	/**
	 * Prints the student array.
	 * @param studentlist student array
	 */
	public void printStudentArray(ArrayList<Student> studentlist);
}
