package structs;
import java.util.*;

public class TreeNode
{
	//members
	int key;
	TreeNode left;
	TreeNode right;

	//Constructor
	public TreeNode(int kk)
	{
		this.key = kk;
		System.out.println("TreeNode created: " + this.key);
	}

	//Methods
	public void print()
	{
		System.out.println("TreeNode key: " + this.key);
	}
}