import java.util.Scanner;
public class Pattern
{
		public  void triangle(int number_of_dot)
	    {
	        for(int i = 1; i < number_of_dot; i++)
	        {
	        	for(int j = number_of_dot - i; j > 0; j--)
	        	{
	        		System.out.print(" ");
	        	}
	        	int j = 0;
	        	while( j < 2 * i - 1)
	        	{
	        		System.out.print("*");
	        		j++;
	        	}
	        	int k = number_of_dot - i ;
	        	while( k > 0 )
	        	{
	        		System.out.print(" ");
	        		k--;
	        	}
	        	System.out.println();
	        }
	    }
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			Pattern p = new Pattern();
			int n  = sc.nextInt();
			p.triangle(n);
		}
	}

