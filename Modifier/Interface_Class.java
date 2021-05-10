interface Bank{
	public void getAmount(int amount);
	public void printAmount();
}
class Person implements Bank{
	int amount ;
	public void getAmount(int amount) {
		 this.amount  = amount;
	}
	public void printAmount() {
		System.out.print(amount);
	}
	
}
public class Interface_Class {
	public static void main(String args[]) {
		Person p = new Person();
		p.getAmount(1000);
		p.printAmount();
	}
}
