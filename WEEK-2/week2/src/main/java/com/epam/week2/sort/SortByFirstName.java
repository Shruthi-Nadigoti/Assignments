/*
 *  @(#)SortByFirstName.java         28/06/18.
 */
package com.epam.week2.sort;

import java.util.Comparator;

import com.epam.week2.Student;

/**
 * Used for sorting student array in ascending array by student first name
 * @author SHRUTHI
 *
 */
public class SortByFirstName implements Comparator<Student> {

    /**
     * compares the one student object with another student object using first name .
     * @param student1 student object
     * @param student2 student object
     * @return integer 0,1 or -1
     */
    @Override
	public int compare(final Student student1, final Student student2) {
        return (student1.getFirstName()).compareTo(student2.getFirstName());
    }
}