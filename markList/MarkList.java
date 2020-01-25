package markList;

import java.util.Scanner;

public class MarkList {

	public static void main(String[] args) {
		/**
		 * Reads information about students on a course and 
		 * prints a results list followed by a report on two of the best students
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name of the course: ");
		String courseName = in.nextLine();
		
		System.out.print("Enter the total number of the students: ");
		int totalNumOfStudents = in.nextInt();
		
		
		String[] studentName = new String[totalNumOfStudents];
		int[] studentNumber = new int[totalNumOfStudents];
		double[] examMark = new double[totalNumOfStudents];
		double[] practicalMark = new double[totalNumOfStudents];
		String[] faculty = new String[totalNumOfStudents];
		int index = 0;
		int currentSize = 0;
		
		
		do {
			currentSize++;
			System.out.println(currentSize + ":");
			System.out.print("Enter the student name:");
			studentName[index] = in.next();
			
			System.out.print("Enter the student number: ");
			studentNumber[index] = in.nextInt();
			
			System.out.print("Enter the mark of the exam: ");
			examMark[index] = in.nextDouble();
			
			System.out.print("Enter the mark of the practical: ");
			practicalMark[index] = in.nextDouble();
			
			System.out.print("Enter the faculty(first character): ");
			String input = in.next();
			faculty[index] = input.toUpperCase();
			
			System.out.println(studentNumber[index] + " " + examMark[index] + " " + 
			                   practicalMark[index] + " " + faculty[index] );
			
			index++;
			
		} while (index < totalNumOfStudents);
		
		// find the highest mark in each faculty 
		double[] totalMark = new double[totalNumOfStudents];
		double highestMark = -1;
		int indexFaculty1 = 0;
		int indexFaculty2 = 0;
		for(int i = 0; i < totalNumOfStudents; i++) {
			
			totalMark[i] = examMark[i] + practicalMark[i];
			
			if(faculty[i] == "A") {
				if (highestMark < totalMark[i]) {
					highestMark = totalMark[i];
					indexFaculty1 = i;
				}
			}
			else if (faculty[i] == "S"){
				if (highestMark < totalMark[i]) {
					highestMark = totalMark[i];
					indexFaculty2 = i;
				}
				
			}
		}
		
		System.out.println("The best students on course " + courseName + " from each faculty were: ");
		
		System.out.println("Faculty of Science: Student " + 
		                     studentNumber[indexFaculty2] + 
		                     " with a total mark of " + 
		                     (int)(totalMark[indexFaculty2]) + "%");
		
		System.out.println("Faculty of Art: Student " + 
                studentNumber[indexFaculty1] + 
                " with a total mark of " + 
                (int)(totalMark[indexFaculty1]) + "%");
		
		System.out.println();
		for (index = 0; index < totalNumOfStudents; index++) {
			System.out.println(studentNumber[index] + "   " + studentName[index] + "   " + 
		                            String.format("%.1f", examMark[index]) + "%   " + 
		                                String.format("%.1f", practicalMark[index])
			                    + "%   " + (int)(examMark[index] + practicalMark[index]) + "%   " + faculty[index]);
		}
		

	}

}
