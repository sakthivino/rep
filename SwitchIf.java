
public class SwitchIf {

	public static void main(String[] args) {
		String dev = "java";
		int n = 2;
		switch(n)
		{
		case  1:
			if(dev.equals("python"))
				System.out.println("Python Intern");
			else
				System.out.println("java Intern");
			break;
		case 2 :
			if(dev.equals("testing"))
				System.out.println("testing Intern");
			else
				System.out.println("not testing Intern");
			break;
			default :
				System.out.print("ui / ux intern");
		}

	}

}
