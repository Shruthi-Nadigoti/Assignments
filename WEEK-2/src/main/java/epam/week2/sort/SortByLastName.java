package epam.week2.sort;

import java.util.Comparator;

import epam.week2.Student;

public class SortByLastName implements Comparator< Student >{
    /**
     * Used for sorting student array in ascending array by id
     */
    @Override
	public int compare( Student a, Student b){
        return (a.getLastName()).compareTo(b.getLastName());
    }
}