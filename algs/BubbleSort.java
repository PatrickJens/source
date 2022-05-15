package algs;
import java.util.*;
import mgmt.*;

public class BubbleSort
{

	public BubbleSort()
	{
		System.out.println("BubbleSort object created");
	}


	public void sort(int[] A)
	{
		int i,j, tmp;
		i = A.length; //i is RHS key
		
		while(i > 0) 
		{
			j = 0;        //j is LHS key
			//System.out.println("i =" + i);
			while(j < i - 1)
			{
				//System.out.println("j = " + j);
				if( A[j] > A[j+1])
				{
					tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
				}
				j ++;
			}
			i--;
		}
	}
/*
	public void sort(int[] A)
	{
		AM am = new AM();
		int i, j, tmp;
		i = 0;
		while(i > 0)
		while(key < A.length - 1)
		{
			am.readInt(A);
			if( A[key] > A[key + 1])
			{
				tmp = A[key];
				A[key] = A[key+1];
				A[key+1] = tmp;
			}
		key++;
		}
	}
*/
}