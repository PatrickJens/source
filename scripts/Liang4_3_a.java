package scripts;

//infinity or error bc false condition never reached. not incrementing
public class Liang4_3_a
{
	public Liang4_3_a()
	{
		int i = 1;
		while(i < 10)
		{
			if( i % 2 == 0)
				System.out.println(i);
		}
	}
}