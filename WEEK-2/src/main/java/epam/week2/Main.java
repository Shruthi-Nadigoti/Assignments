/**
 * this application contains student info.
 * @author SHRUTHI
 */
package epam.week2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class Main{
	/**
	 *  this is main method
	 */
    public static void main( final String[] args ){
    	final Scanner scannerObject = new Scanner(System.in);
    	final StudentArrayOperations studentOperationsObject = new StudentArrayOperations();
    	String csvFilePath = "C:/Users/SURATHI/eclipse-workspace/week2/src/main/java/epam/week2/student.csv";
    	studentOperationsObject.loadCSVFileToStudentArray(csvFilePath);
    	while(true) {
    		System.out.println("Enter \n\t"
    				+ "1 - To sort the student array\n\t"
    				+ "2 - To search the student array\n\t"
    				+ "3 - To print the student array\n\t"
    				+ "4 - To Exit");
    		int input = scannerObject.nextInt();
    		switch(input) {
    			case 1:
    				int column;
    				while(true) {
    				System.out.println("Enter \n\t"
    	    				+ "1 - To Sort By Id\n\t"
    	    				+ "2 - To Sort By First Name\n\t"
    	    				+ "3 - To Sort By Last Name\n\t"
    	    				+ "4 - To Sort By Department Name\n\t"
    	    				+ "5 - To Exit");
    				column = scannerObject.nextInt();
    				if(column >= 1 && column <= 4) {
    					ArrayList<Student> sortedStudentList=studentOperationsObject.SortStudentArray(column);
    					studentOperationsObject.printStudentArray(sortedStudentList);
    				}else if(column == 5) {
    					break;
    				}else {
    					System.out.println("Please enter Valid option");
    				}
    				}
    				break;
    			case 2:
    				System.out.println("Enter the search String:");
    				Scanner scannerObject2 = new Scanner(System.in);
    				String searchString = scannerObject2.nextLine();
    				ArrayList<Student> resultStudentArray=studentOperationsObject.searchStudent(searchString);
    				studentOperationsObject.printStudentArray(resultStudentArray);
    				break;
    			case 3:
    				studentOperationsObject.printStudentArray(studentOperationsObject.getStudents());
    				break;
    			case 4:
    				System.out.println("Thank you!");
    				System.exit(0);
    			default:
    				System.out.println("Please enter valid option.");

    		}
    	}

    }
}
