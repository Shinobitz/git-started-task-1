package animalWorld;

public class Dog extends Animal{
	String colour;
	
	public Dog(String name, String colour) {
		super(name);
		this.colour = colour;
	}
	
	public void bark() {
		System.out.println("Bark bark!!!");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	
}
