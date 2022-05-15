package structs;
import java.util.*;

public class BST
{
	//member
	TreeNode root;

	//constructor
	public BST()
	{
		root = null;
		System.out.println("BST created");
	}

	//methods
	public void printRoot()
	{
		if(root == null)
			System.out.println("BST has no nodes");
		else
			System.out.println("Root: " + root.key);
	}

	//append starter function
	public void append(int kk)
	{
		root = appendRec(root, kk);
	}
	//recursive append
	public TreeNode appendRec(TreeNode current, int kk)
	{
		//base case: node is null 
		if(current == null)
		{
			return new TreeNode(kk);
		}
		//traverse
		if( kk < current.key)
		{
			current.left = appendRec(current.left, kk);
		}
		else if( kk > current.key)
		{
			current.right = appendRec(current.right, kk);
		}
		return current;
	}

	//inorder traversal starter function
	public void inOrder()
	{
		root = inOrderRec(root);
		System.out.println("End in order traversal \n");
	}
	//inorder recursive function
	public TreeNode inOrderRec(TreeNode current)
	{
		if(current == null)
		{
			return current; //close frame
		}
		else
		{
			current.left = inOrderRec(current.left);
			System.out.println("" + current.key);
			current.right = inOrderRec(current.right);
		}
		return current;
	}
}