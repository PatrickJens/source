import algs.*;
import mgmt.*;
import scripts.*;
import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		AM am = new AM();
		int[] A = {5,4,3,3,8,8,8,9,2};//am.createInt(10);
		am.readInt(A);
		//InsertionSort is = new InsertionSort();
		//is.sort(A);
		BubbleSort bs = new BubbleSort();
		bs.sort(A);
		am.readInt(A);
	}
}