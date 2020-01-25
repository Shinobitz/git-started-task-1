package swMarkList;

import java.util.List;
import java.util.Scanner;

public class MarkList 
{
	/**
	 * 	Write a program named MarksList which reads information about students on a course (using the keyboard)
	 * 	and prints a results list followed by a report on two of the best students. The precise details are:

	   	Input Data: The first line of data should contain the course name. The second line of data should contain a 
	   	single integer (between 1 and 10) representing the total numbers of students. 

	   	Each subsequent line contains data for one student as follows:

	   	studentNumber 	: an integer in the range 700000..999999
	   	examMark		: real number in the range 0.0 to 80.0
	   	practicalMark	: a real number in the range 0.0 to 20.0
	   	faculty			: ‘A’ for the Faculty of Arts or ‘S’ for the faculty of science

	   	For example, a typical line of data for one student is:
	   	792146		68.3	16.5	A
	   	You can assume that the input data has been validated.

	   	Results: A table showing the student number, examination mark, practical mark and 
	   	faculty for each student is to be printed followed by a statement of the form:

		The best students on course xxxxxxxxxxxxxxxxxx from each faculty were:
		Faculty of Science	: student xxxx, with a total mark of xx%
		Faculty of Arts		: student xxxx, with a total mark of xx%

		In the results, the examination and practical marks should be printed with one digit after the 
		decimal point and the total marks should be printed as integers.
	 *
	 */

	//Ask the user for course name, 
		//store the input in a variable
	
	//Ask the user for number of students,
		//create n number of students using the previous input
	
	//input and store student number for that particular student
	//input and store exam mark for that particular student
	//input and store practical mark for that particular student
	//input and store faculty for that particular student
	
	//output all student infomation in a specific format for all students in the course
	
	//output the report in a specific format
		//check for the best student in one of the faculties
			//output the best student's details in specified format
		//repeat previous steps to get the other best student
	
	public static void main(String[] args) 
	{
		String course = stringInput("Please enter the name of the course: ");
		Student[] students = new Student[getArraySize()];

		/*Student[] students = new Student[10];
		students[0] = new Student(777777,34,16,'A');
		students[1] = new Student(777778,57,15,'S');
		students[2] = new Student(777779,76.5,6.5,'S');
		students[3] = new Student(777780,65.5,10.75,'A');
		students[4] = new Student(777781,36,16,'S');
		students[5] = new Student(888891,13.25,13.75,'A');
		students[6] = new Student(887865,74.5,18.75,'A');
		students[7] = new Student(999994,25.5,13,'A');
		students[8] = new Student(999999,64,5.5,'S');
		students[9] = new Student(789789,26.75,1.5,'S');*/

		fillStudentInfo(students);

		printStudents(students);
		printReport(students,course);
	}

	/**
	 * 
	 * @return size of type int
	 */
	private static int getArraySize()
	{
		int size = 0;

		do 
		{
			size = intInput("Please enter the number of students (between 1 to 10).");
		}
		while(size < 1 && size > 10);

		return size;	
	}

	private static void fillStudentInfo(Student[] students)
	{
		for(int i = 0; i< students.length; i++)
		{
			students[i] = new Student(inputStudentID(),inputExamMark(),inputPracMark(),pickFaculty());
		}
	}

	private static int inputStudentID()
	{
		int id = 0;

		do
		{
			id = intInput("Please enter Student's ID");
		}while(id < 700000 || id > 999999);

		return id;
	}

	private static double inputExamMark()
	{
		double mark = -1;

		do
		{
			mark = doubleInput("Please enter the exam mark(between 0-80)");
		}while(mark < 0 || mark > 80);

		return mark;
	}

	private static double inputPracMark()
	{
		double mark = -1;

		do
		{
			mark = doubleInput("Please enter the practical mark(between 0-20)");
		}while(mark < 0 || mark > 20);

		return mark;
	}

	private static char pickFaculty()
	{
		int choice = 0;

		while(choice != 1 && choice != 2)
		{
			System.out.println("1.Faculty of Arts");
			System.out.println("2.Faculty of Science");
			choice = intInput("Please pick the faculty using 1 or 2");

			switch(choice)
			{
			case 1: {return 'A';}
			case 2: {return 'S';}
			default: {System.out.println("Invalid Input"); break;}
			}
		}
		return ' ';
	}

	private static void printStudents(Student[] students)
	{
		for(int i = 0; i< students.length; i++)
		{
			students[i].printStudent();
		}
	}

	private static void printReport(Student[]students, String course)
	{
		System.out.println("The best students on course " + course + " from each faculty were:");
		System.out.println("Faculty of Science: " + printBestStudent(students, 'S'));
		System.out.println("Faculty of Arts: " + printBestStudent(students, 'A'));
	}

	private static String printBestStudent(Student[]students,char faculty)
	{
		int studentIdx = checkBestStudent(students,faculty);
		if(studentIdx != -1)
		{
			return "Student " + students[studentIdx].getId() + ", with total mark of " + (int)(students[studentIdx].getExamMark() + students[studentIdx].getPracMark()) + "%";
		}
		else
		{
			return "No enrolled students";
		}
	}

	private static int checkBestStudent(Student[] students, char faculty)
	{
		double bestMark = 0;
		int studentIdx = -1;

		for(int i = 0; i< students.length; i++)
		{
			if((students[i].getExamMark() + students[i].getPracMark()) > bestMark && students[i].getFaculty() == faculty)
			{
				bestMark = (students[i].getExamMark() + students[i].getPracMark());
				studentIdx = i;
			}
		}

		return studentIdx;
	}

	private static int intInput(String message)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(message);

		while (!in.hasNextInt())
		{
			System.out.println("Invalid input please enter integers only");
			in.next();
		}

		return in.nextInt();
	}

	private static double doubleInput(String message)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(message);

		while (!in.hasNextDouble())
		{
			System.out.println("Invalid input please enter integer or floating point values only");
			in.next();
		}

		return in.nextDouble();
	}

	private static String stringInput(String message)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(message);
		return in.nextLine();
	}

}
