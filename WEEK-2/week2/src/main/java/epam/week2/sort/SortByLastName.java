/*
 *  @(#)SortByLastName.java         28/06/18
 */
package epam.week2.sort;

import java.util.Comparator;

import epam.week2.Student;

/**
 * Used for sorting student array in ascending array by student last name.
 * @author SHRUTHI
 */
public class SortByLastName implements Comparator<Student> {

	/**
	 * compare the one object with another using last name.
	 * @param student1 student object
     * @param student2 student object
     * @return integer  0,1 or -1
	 */
    @Override
	public final int compare(final Student student1, final Student student2) {
        return (student1.getLastName()).compareTo(student2.getLastName());
    }
}