package algs;
import java.util.*;

public class InsertionSort
{
	public InsertionSort()
	{
		System.out.println("InsertionSort object created");
	}

	public void sort(int[] A)
	{
		int key, i, temp;
		key = 0;
		//increment key across entire array
		while(key < A.length)
		{
			//start at key 
			i = key;
			//push min value to front of array (ascending)
			while(i > 0)
			{
				if(A[i] < A[i-1] )
				{
					temp = A[i];
					A[i] = A[i-1];
					A[i-1] = temp;
 				}
 				i--;
			}
			key ++;
		}
	}
}