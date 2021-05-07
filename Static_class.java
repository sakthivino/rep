class Static {
	int dev_id;
	String name;
	static String company_name = "Full Creative";

	Static(int dev_id, String name) {
		this.dev_id = dev_id;
		this.name = name;
	}

	void printDetails() {
		System.out.println(dev_id + " " + name + " " + company_name);
	}
}

public class Static_class {

	public static void main(String[] args) {

		Static s = new Static(1, "Sathya");
		Static h = new Static(2, "Arun");
		s.printDetails();
		h.printDetails();

	}

}
