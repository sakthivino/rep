class Animals{
	public void printSound() {
		System.out.println("There are different kind of animal sounds");
	}
}
class Cat extends Animals{
	public void printSound() {
		System.out.println("Cat sound is meow");
	}
}
class MethodOverRiding {
	public static void main(String[] args) {
		Animals animals= new Animals();
		animals.printSound();
		Cat cat = new Cat();
		cat.printSound();
		Animals ani = new Cat();
		ani.printSound();
	}

}
