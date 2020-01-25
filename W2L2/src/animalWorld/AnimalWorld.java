package animalWorld;

public class AnimalWorld {

	public static void main(String[] args) {
		Animal an1 = new Animal("Name");
		Animal an2 = new Dog("Namme of dog", "black");
		Dog an3 = new Dog("Snoopy", "white");
		
		
		an1.eat();
		an1.sleep();
		System.out.println();
		
		an2.eat();
		an2.sleep();
		System.out.println(an2.getName());
		System.out.println(an2.getColour());
		System.out.println();
		
		an3.eat();
		an3.sleep();
		an3.bark();
		
		System.out.println(Animal.getName());
	}

}
