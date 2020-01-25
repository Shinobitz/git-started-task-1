package animalWorld;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Munch munch munch....");
	}
	public void sleep() {
		System.out.println("Zzzzzz.......");
	}
}
