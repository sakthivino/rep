abstract class Details{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void printAddress();
}
class Person1 extends Details{
	
	
	@Override
	void printAddress() {
		// TODO Auto-generated method stub
		System.out.println("Person1 address");
	}
	
}
class Person2 extends Details{
	
	void printAddress() {
		// TODO Auto-generated method stub
		System.out.println("Person2 address");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setName("sathya");
		p.printAddress();
		
		Person2 p2 = new Person2();
		p2.printAddress();
		

	}

}
