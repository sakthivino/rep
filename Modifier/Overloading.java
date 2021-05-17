class Additions {
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	void add(int num1, float num2) {
		System.out.println(num1 + num2);

	}
	
	void add(float num1, float num2, float num3) {
		System.out.println(num1+ num2 + num3);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Additions addition = new Additions();
		addition.add(4,5);
		addition.add(3.5f, 4.3f, 9.8f);

	}

}
