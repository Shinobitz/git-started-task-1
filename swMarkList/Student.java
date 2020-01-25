package swMarkList;

public class Student 
{
	//properties
	private int id;
	private double examMark;
	private double pracMark;
	private char faculty;
	
	//constructors
	Student(int id,double examMark,double pracMark,char faculty)
	{
		this.id = id;
		this.examMark = examMark;
		this.pracMark = pracMark;
		this.faculty = faculty;
	}
	//default constructor
	Student()
	{
		this.id = 0;
		this.examMark = 0;
		this.pracMark = 0;
		this.faculty = ' ';
	}
	
	//behaviours
	public void printStudent()
	{
		System.out.printf("Student ID: %-10.6s  Exam Mark: %-10.1f Practical Mark: %-10.1f Faculty: %-10.2s \n", id,examMark,pracMark,faculty);
	}
	
	public String toString()
	{
		return "Student ID: " + id + ", Exam Mark: " + examMark + ", Practical Mark: " + pracMark + ", Faculty: " + faculty;
	}

	//getters, no setters as the values are never updated
	public int getId() {
		return id;
	}

	public double getExamMark() {
		return examMark;
	}

	public double getPracMark() {
		return pracMark;
	}

	public char getFaculty() {
		return faculty;
	}
	
}
