class Dog{
	public String name;
	String breed;
	int size;
	
	public void bark() {
		System.out.println("ruff ruff");
	}
}

public class DogTestDrive {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name="Shero";
		d.breed= "Labra";
		d.size= 20;
		d.bark();
	}
	
}
