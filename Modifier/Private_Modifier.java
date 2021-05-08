class Student_detail
{
	private final int roll_no = 20;
	private static  final String college_name = "BIT";
	  void printDetails()
	{
	      String name = "Sathya";
		System.out.println(roll_no + " " + name + " " +college_name);
	}
}
public class Private_Modifier {

	public static void main(String[] args) {
		Student_detail student = new Student_detail();
		student.printDetails();

	}

}
