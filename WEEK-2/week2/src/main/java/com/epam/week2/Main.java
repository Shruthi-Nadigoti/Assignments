/*
 * @(#)Main.java         29/06/18
 * this application contains students info.
 * students info is loaded by csv file
 * set of operations like sorting and searching can be performed on this student list.
 */
package com.epam.week2;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * The application can controlled by this Main class.
 * @version 1.0.0
 * @author SHRUTHI
 */
public class Main {

	/**
	 * It's a main method, The program starts from here
	 * @param args it takes command line arguments
	 */
    public static void main(final String[] args) {
    	final Scanner scannerObject = new Scanner(System.in);
    	final StudentOperations studentOperationsObject = new StudentOperations();
    	Properties prop = new Properties();
    	InputStream input = null;
    	try {
    		input = new FileInputStream("resources/config.properties");
    	    prop.load(input); 	// load a properties file
    	    String csvFilePath = prop.getProperty("csvFilePath");
	    	ArrayList<Student> students = studentOperationsObject.loadCSVFileToStudentArray(csvFilePath);
	    	studentOperationsObject.setStudents(students);

	    	int choice = 0;
	    	do {
	    		System.out.println("Enter \n\t"
	    					+ "1 - To sort the student array\n\t"
	    					+ "2 - To search the student array\n\t"
	    					+ "3 - To print the student array\n\t"
	    					+ "4 - To Exit");
	    		choice = scannerObject.nextInt();
	    		switch (choice) {
	    			case 1:
	    				int column;
	    				while (true) {
	    				System.out.println("Enter \n\t"
	    	    				+ "1 - To Sort By Id\n\t"
	    	    				+ "2 - To Sort By First Name\n\t"
	    	    				+ "3 - To Sort By Last Name\n\t"
	    	    				+ "4 - To Sort By Department Name\n\t"
	    	    				+ "5 - To Sort By Year\n\t"
	    	    				+ "6 - To Exit");
	    				column = scannerObject.nextInt();
	    				if (column >= 1 && column <= 5) {
	    					ArrayList<Student> sortedStudentList = studentOperationsObject.sortStudentArray(column);
	    					studentOperationsObject.printStudentArray(sortedStudentList);
	    				} else if(column == 6) {
	    					break;
	    				} else {
	    					System.out.println("Please enter Valid option");
	    				}
	    				}
	    				break;
	    			case 2:
	    				System.out.println("Enter the search String:");
	    				Scanner scannerObject2 = new Scanner(System.in);
	    				String searchString = scannerObject2.nextLine();
	    				ArrayList<Student> resultStudentArray = studentOperationsObject.searchStudent(searchString);
	    				studentOperationsObject.printStudentArray(resultStudentArray);
	    				break;
	    			case 3:
	    				studentOperationsObject.printStudentArray(studentOperationsObject.getStudents());
	    				break;
	    			case 4:
	    				System.out.println("Thank you!");
	    				break;
	    			default:
	    				System.out.println("Please enter valid option.");

	    		}
	    	} while (choice != 4);

    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		scannerObject.close();
    	}
    }
}
