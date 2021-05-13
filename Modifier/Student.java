class Det{
	String name;
	int rollNo;
	String collegeAddress ;
	int clgNo;
	String clgDept;
	Det(String collegeAddress){
		this.collegeAddress = collegeAddress;
		
	}
	Det(String name, int rollNo){
		this("BIT");
		this.name = name;
		this.rollNo = rollNo;
	}
	Det(int clgNo, String clgDept){
		this.clgNo = clgNo;
		this.clgDept= clgDept;
	}
	public void printDetails() {
		
		System.out.println(" name " + name );
		System.out.println(" id " + rollNo);
		System.out.println(" College name " + collegeAddress);
		System.out.println(" clgNo " + clgNo + " " + " clgDept " + clgDept);
	}
	
}
public class Student {

	public static void main(String[] args) {
		Det details = new Det("sathya", 1);
		details.printDetails();
		Det details1 = new Det(1, "vit");
		details1.printDetails();
		

	}

}
