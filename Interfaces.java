interface vehicle{
	void applyAccelarate();
	void applyBreak();
	
}
class Car implements vehicle{
	public void applyAccelarate() {
		System.out.print("we can apply accelaration");
	}
	public void applyBreak() {
		System.out.print("we can apply break");
	}
}
class Bus implements vehicle{
	public void applyAccelarate() {
		System.out.print("we can apply accelaration for bus");
	}
	public void applyBreak() {
		System.out.print("we can apply accelaration for bus");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		
          Bus b = new Bus();
          b.applyAccelarate();
	}

}
