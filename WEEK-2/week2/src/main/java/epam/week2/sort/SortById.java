/*
 * @(#)SortById.java         28/06/18
 */
package epam.week2.sort;

import java.util.Comparator;

import epam.week2.Student;

/**
 * Used for sorting student array in ascending array by id.
 * @author SHRUTHI
 */
public class SortById implements Comparator<Student> {

    /**
     * Used for sorting student array in ascending array by id
     * @param student1 student object
     * @param student2 student object
     * @return integer  0,1 or -1
     */
    @Override
	public int compare(final Student student1, final Student student2) {
        return (student1.getId()).compareTo(student2.getId());
    }
}