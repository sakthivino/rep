class Static_M {
	int roll_no;
	String name;
	static String college_name = "BIT";

	Static_M(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;

	}

	static void change() {
		college_name = "IIT";
	}

	void displayDetails() {
		System.out.println(roll_no + " " + name + " " + college_name);
	}

}

public class StaticMethod {

	public static void main(String[] args) {

		Static_M s = new Static_M(1, "Sathya");
		s.displayDetails();
		Static_M.change();
		Static_M s1 = new Static_M(2, "Vinoth");
		s1.displayDetails();

	}

}
