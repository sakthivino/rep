class User{
	String name ;
	User(String name){
		this.name = name;
	}
	void printName() {
		System.out.print("User name is " + name);
	}
}
public class Constructor {

	public static void main(String[] args) {
		User obj = new User(null);
		obj.printName();

	}

}
