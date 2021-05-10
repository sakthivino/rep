interface SBI {
	

	public void getLoan(int amount);

	public void printInterest(int amount, int year);

}

interface RBI {
	public int loan_interest_percentage = 10;

	public void tax(int amount);

	
}

class People implements RBI, SBI {
	int eligible_amount = 1000;

	public void getLoan(int amount) {
		if (amount > eligible_amount) {
			System.out.println("You will get loan");
		}
		else {
			System.out.println("You will not get loan");
		}
	}

	public void printInterest(int amount, int year) {
		int interest = amount* (1 + (year * RBI.loan_interest_percentage));
		System.out.println("The interest is " + interest);
	}

	public void tax(int amount) {
		if (amount >= 10000) {
			System.out.println("You are eligible for paying tax");
		} else {
			System.out.println("You are not eligible for paying tax");
		}
	}

	
}

public class Multiple_Inheritance {

	public static void main(String[] args) {

		People p = new People();
		int amount = 100000;
		int year = 10;
		p.getLoan(amount);
		p.printInterest(amount, year);
		p.tax(amount);
		

	}

}
