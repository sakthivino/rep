import java.util.*;
public class StarTriangle
{
		public static void triangle(int number_of_dot)
	    {
	        for(int i = 1; i < number_of_dot; i++)
	        {
	        	for(int j = number_of_dot - i; j > 0; j--)
	        	{
	        		System.out.print(" ");
	        	}
	        	for(int j = 0; j < 2 * i - 1; j++)
	        	{
	        		System.out.print("*");
	        	}
	        	for(int j = number_of_dot - i ; j > 0; j--)
	        	{
	        		System.out.print(" ");
	        	}
	        	System.out.println();
	        }
	    }
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int number_of_dot  = sc.nextInt();
			Main.triangle(number_of_dot);
		}
	}

