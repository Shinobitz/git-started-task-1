
public class Employee extends Person {
	private double salary;
	
	public Employee(String name, double salary) {
		super(name);//coming from parent (Parent class)
		this.salary = salary;
	}
}
