
public class Person {
	//attributes
	private String name;
	private int age;
	
	//constructor
	public Person() {// default
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(Person p) {// this Person p contains already have all attributes.
		this.name = p.name;
	}
	
	//methods
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName());
		
		Person p2 = new Person("Bob");//Person(String name)
		System.out.println(p2.getName());
		
		Person p3 = new Person(p2);//Person(Person p)
		System.out.println(p3.getName());
		
	}
}
