
public class Final_Class {

	final void method1()
	{
		System.out.println("Final Method");
	}
	public static void main(String[] args) {
		final double pi= 3.14;
		
		System.out.println(pi);
		Final_Class f = new Final_Class();
		f.method1();
	}

}
