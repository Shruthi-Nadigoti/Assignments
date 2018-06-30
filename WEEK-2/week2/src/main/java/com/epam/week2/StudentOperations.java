/*
 * @(#)StudentOperations.java         28/06/18
 * This file contains class called studentArrayOperations.
 */
package com.epam.week2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.epam.week2.sort.SortByDepartmentName;
import com.epam.week2.sort.SortByFirstName;
import com.epam.week2.sort.SortById;
import com.epam.week2.sort.SortByLastName;
import com.epam.week2.sort.SortByYear;

/**
 * Contains set of operations that can be performed on student list.
 * @version 1.0.0
 * @author SHRUTHI
 *
 */
public class StudentOperations implements StudentOperationsInterface {
	/**
	 * contains list of students.
	 */
	private ArrayList<Student> students;
	/**
	 *
	 * @return student array
	 */

	public ArrayList<Student> getStudents() {
		return students;
	}

	/**
	 * sets the students
	 * @param students list of students
	 * @throws IllegalArgumentException if the students equal to null
	 */
	public void setStudents(ArrayList<Student> students) throws IllegalArgumentException {
		if (students == null) {
			throw new IllegalArgumentException();
		}
		this.students = students;
	}

	/**
	 * loads csv file data into students list.
	 * @param csvFilePath path of the csv file
	 * @return student list which is loaded from csv file
	 */
	public ArrayList<Student> loadCSVFileToStudentArray(String csvFilePath) {
	    String line = "";
	    String cvsSplitBy = ",";
	    ArrayList<Student> studentsList = new ArrayList<Student>();
	    try (BufferedReader bufferReaderObject = new BufferedReader(new FileReader(csvFilePath))) {
	    	line = bufferReaderObject.readLine();
	    	while ((line = bufferReaderObject.readLine()) != null) {

	    		String[] studentRow = line.split(cvsSplitBy);
	    		String id = studentRow[0];
	    		String firstName = studentRow[1];
	    		String lastName = studentRow[2];
	    		String department = studentRow[3];
	    		String year = studentRow[4];
	    		Student studentObject = new Student(id, firstName, lastName, department, year);
	    		studentsList.add(studentObject);
	    	}
	    	return studentsList;
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return null;
	}

	/**
	 * It gives copy of student list.
	 * used for performing some actions like sorting.
	 * @param originalStudentList original list of students
	 * @return copy of list of students
	 */
	public ArrayList<Student> getCopyOfStudentList(ArrayList<Student> originalStudentList) {
		ArrayList<Student> copyStudentList = new ArrayList<Student>();
		for (int index = 0; index < originalStudentList.size(); index++) {
			Student originalStudent = originalStudentList.get(index);
			Student student = new Student(originalStudent.getId(), originalStudent.getFirstName(),
										originalStudent.getLastName(), originalStudent.getDepartmentName(),
										originalStudent.getYear());
			copyStudentList.add(student);
		}
		return copyStudentList;

	}

	/**
	 * Sort the student array according to user choice.
	 * @param column given by user to sort the array accordingly
	 * @return student sorted array list
	 */
	@Override
	public ArrayList<Student> sortStudentArray(int column) {
		ArrayList<Student> sortedStudentList = getCopyOfStudentList(getStudents());
		if (column == 1) {
			Collections.sort(sortedStudentList, new SortById());
		} else if (column == 2) {
			Collections.sort(sortedStudentList, new SortByFirstName());
		} else if (column == 3) {
			Collections.sort(sortedStudentList, new SortByLastName());
		} else if (column == 4) {
			Collections.sort(sortedStudentList, new SortByDepartmentName());
		} else if(column == 5) {
			Collections.sort(sortedStudentList, new SortByYear());
		}
		return sortedStudentList;
	}

	/**
	 * Gives the which matches with the search string.
	 * @param searchString any string given by user
	 * @return resulted student list
	 */
	@Override
	public ArrayList<Student> searchStudent(String searchString) {
		ArrayList<Student> resultStudentList = new ArrayList<Student>();
		for (int index = 0; index < students.size(); index++) {
				Student student = students.get(index);
				if ((searchString.equalsIgnoreCase(student.getId()))
									|| (searchString.equalsIgnoreCase(student.getFirstName()))
									|| (searchString.equalsIgnoreCase(student.getLastName()))
									|| (searchString.equalsIgnoreCase(student.getDepartmentName())
								    || (searchString.equalsIgnoreCase(student.getYear())))) {

					resultStudentList.add(student);
				}
		}
		return resultStudentList;
	}

	/**
	 * Prints the student array.
	 * @param studentlist student array
	 */
	@Override
	public void printStudentArray(ArrayList<Student> studentlist) {
		if (studentlist.size() == 0) {
			System.out.println("Empty list");
			return;
		}
		System.out.println("ID   |  First Name | Last Name |  Department Name | Year");
		for (int index = 0; index < studentlist.size(); index++) {
			Student student = studentlist.get(index);
			System.out.println(student.getId() + " | "
									+ student.getFirstName() + " | "
									+ student.getLastName()+ " | "
									+ student.getDepartmentName()+ " | "
									+ student.getYear());
		}
	}

}
