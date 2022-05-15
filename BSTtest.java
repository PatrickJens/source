//package structs;
import java.util.*;
import structs.*;

public class BSTtest
{
	
	public static void main(String args[])
	{
		BST bst = new BST();
		bst.append(100);
		bst.append(50);
		bst.append(150);
		bst.printRoot();
		bst.inOrder();
		bst.printRoot();
		bst.inOrder();
	}
}