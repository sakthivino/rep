
import java.util.*;

class Foreach

	{
		public static void main(String args[])
		{
			char arr[] = {'a','v','d','e','t'};
			System.out.println("Array(for loop)");
			for(int i = 0; i < arr.length; i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("Foreach");
			for(char c :arr)
			System.out.println(c);
			LinkedList<Integer> k = new LinkedList<Integer>();
			System.out.println("Collections");
			k.add(1);
			k.add(2);
			k.add(3);
			for(int a : k)
			{
				System.out.println(a);
			}
		}
	}
