class VarargsOverloading{
	void add(int ... args) {
		int value = 0;
		for(int x : args) {
			value = value + x;
		}
		System.out.println(value);
	}
	void add(double... args) {
		double value = 0;
		for(double x : args) {
			value = value + x;
		}
		System.out.println(value);
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarargsOverloading main = new VarargsOverloading();
		main.add(10,3,4,34,23);
		main.add(10.4,3.34,34.23,323.2);
		
	}

}
