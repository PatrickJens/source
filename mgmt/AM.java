package mgmt;
import java.io.*;
import java.util.Random;


public class AM
{
	/* fields */
	private Random r = new Random();

	/* constructors */
	public AM()
	{
		System.out.println("Array Manager object created");
	}

	/* methods */
	public int[] createInt(int size)
	{
		int[] a = new int[size];
		for(int i = 0 ; i < size ; i ++)
		{
			a[i] = r.nextInt(5);
		}
		return a;
	}

	public void readInt(int[] a)
	{
		for(int i = 0 ; i < a.length ; i ++)
		{
			System.out.print(" " + a[i]);
		}
		System.out.println("");
	}
}