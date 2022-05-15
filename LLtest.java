import algs.*;
import mgmt.*;
import scripts.*;
import java.util.*;
import structs.*;

public class LLtest
{
	public static void main(String args[])
	{
		 LL ll = new LL();
		 ll.appendToEnd('a');
		 ll.appendToEnd('b');
		 ll.appendToEnd('c');
		 ll.appendToEnd('d');
		 ll.appendToStart('e');
		 ll.insertAfter('c', 'f');
		 //ll.printHead();
		 //ll.printCurrent();
		 ll.print();
		 ll.printHead();
		 ll.printCurrent();
		 ll.delete('b');
		 ll.print();

		 
	}
}