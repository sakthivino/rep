class Staff{
	String name ;
	int staffId;
	void display() {
		System.out.println("Staff name " + name );
		System.out.println("staff id " +  staffId);
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		Staff staff = new Staff();
		staff.display();
		Staff s = new Staff();
		s.name  = "Sasthua";
		s.staffId = 1;
		s.display();
	}

}
