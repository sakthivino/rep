abstract class Car{
	 
	void carWash() {
		System.out.println("You are planning for car wash");
	}
	abstract void claimInsurence();
}
class Benz extends Car{
	


	@Override
	void claimInsurence() {
				System.out.println("Your insurence was claimed");
		
	}
}
public class Abstract {

	public static void main(String[] args) {
		
			Benz b = new Benz();
			// b.carWash();
			b.claimInsurence();
	}

}
