abstract class Animal {
	String dogSound = "bow bow";

	public abstract void getAnimalName();

	public abstract void printAnimalName();

	public void printGetBreed() {
		System.out.println("Golden Retriever");
	}
}

class Dog extends Animal {
	String dog_name;

	public void getAnimalName() {

		dog_name = "Ruby";
	}

	@Override
	public void printAnimalName() {
		System.out.println("Dog name is " + dog_name);

	}

}

public class Abstract_Class {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.getAnimalName();
		d.printAnimalName();
		d.printGetBreed();
		System.out.print(d.dogSound);
	}

}
