/**
 * This file contains class studentArrayOperations.
 */
package epam.week2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import epam.week2.sort.SortByDepartmentName;
import epam.week2.sort.SortByFirstName;
import epam.week2.sort.SortById;
import epam.week2.sort.SortByLastName;

/**
 *
 * @author SURATHI
 *
 */
public class StudentArrayOperations {

	private ArrayList<Student> students;
	/**
	 *
	 * @return student array
	 */
	public ArrayList<Student> getStudents(){
		return students;
	}
	public ArrayList<Student> loadCSVFileToStudentArray(String csvFilePath){
	    String line = "";
	    String cvsSplitBy = ",";
	    students = new ArrayList<Student>();
	    try (BufferedReader bufferReaderObject = new BufferedReader(new FileReader(csvFilePath))){
	    	line=bufferReaderObject.readLine();
	    	while ((line=bufferReaderObject.readLine())!=null) {

	    		String[] studentRow = line.split(cvsSplitBy);
	    		String id = studentRow[0];
	    		String firstName = studentRow[1];
	    		String lastName = studentRow[2];
	    		String department = studentRow[3];
	    		Student studentObject = new Student (id, firstName, lastName, department);
	    		students.add(studentObject);
	    	}
	    	return students;
		}catch(IOException e){
			e.printStackTrace();
		}
	    return null;
	}
	public ArrayList<Student> getCopyOfStudentList(ArrayList<Student> originalStudentList) {
		ArrayList<Student> copyStudentList = new ArrayList<Student>();
		for (int index=0; index < originalStudentList.size(); index++) {
			Student originalStudent=originalStudentList.get(index);
			Student student=new Student(originalStudent.getId(),originalStudent.getFirstName(),
										originalStudent.getLastName(),originalStudent.getDepartmentName());
			copyStudentList.add(student);
		}
		return copyStudentList;

	}
	public ArrayList<Student> SortStudentArray(int column){
		ArrayList<Student> sortedStudentList = getCopyOfStudentList(getStudents());
		if (column == 1) {
			Collections.sort(sortedStudentList, new SortById());
		}else if(column == 2){
			Collections.sort(sortedStudentList, new SortByFirstName());
		}else if(column == 3) {
			Collections.sort(sortedStudentList, new SortByLastName());
		}else if(column == 4) {
			Collections.sort(sortedStudentList, new SortByDepartmentName());
		}
		return sortedStudentList;
	}

	public ArrayList<Student> searchStudent(String searchString){
		ArrayList<Student> resultStudentList = new ArrayList<Student>();
		for (int index=0; index < students.size(); index++) {
				Student student=students.get(index);
				if((searchString.equalsIgnoreCase(student.getId()))
									|| (searchString.equalsIgnoreCase(student.getFirstName()))
									|| (searchString.equalsIgnoreCase(student.getLastName()))
									|| (searchString.equalsIgnoreCase(student.getDepartmentName()))) {

					resultStudentList.add(student);
				}
		}
		return resultStudentList;
	}

	public void printStudentArray(ArrayList<Student> studentlist){
		if (studentlist.size()==0) {
			System.out.println("Empty list");
			return;
		}
		System.out.println("ID   |  First Name | Last Name |  Department Name");
		for (int index=0; index < studentlist.size(); index++) {
			Student student=studentlist.get(index);
			System.out.println(student.getId() + " | "
									+ student.getFirstName() + " | "
									+ student.getLastName()+ " | "
									+ student.getDepartmentName());
		}
	}

}
