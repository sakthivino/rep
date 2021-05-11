interface Study{
	void subject();
}

class Students implements Study{
	public void subject() {
		System.out.print("The current semester subject is INTRODUCTION TO JAVA");
		
	}
}
public class Interface {

	public static void main(String[] args) {
		Students object = new Students();
		object.subject();
            
	}

}
