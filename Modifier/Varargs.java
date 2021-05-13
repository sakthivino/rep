class Subtraction{
	void sub(int ... args) {
		int value = 0;
		for(int x : args)
			value =  x - value;
		System.out.println(value);
	}
	
}
public class Varargs {

	public static void main(String[] args) {
		Subtraction subtraction  = new Subtraction();
		subtraction.sub(5,8);
		subtraction.sub(10,14,43,33,34);
		
	}

}
