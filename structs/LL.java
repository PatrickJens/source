package structs;
import java.util.*;


public class LL
{
	//constructor
	public LL()
	{
		System.out.println("Linked list has been created.");
	}
	//nested class (member)
	public class Node
	{
		public char key;
		public Node next;
		public Node prev;
		//constructor
		public Node(char k)
		{
			this.key = k;
			System.out.println("Node created with key  " + this.key);
		}
		//function
		void print()
		{
			System.out.println(this.key+"");
		}
	}

	//members
	Node head;
	Node current;

	public void printHead()
	{
		System.out.print("Head:    "); 
		head.print();
	}

	public void printCurrent()
	{
		System.out.print("Current: ");
		current.print();
	}

	//functions
	public void appendToEnd(char key)
	{
		if(head == null)
		{
			head = new Node(key);
			current = head;
		}
		else
		{
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new Node(key);
		}
		current = head;
	}

	public void appendToStart(char key)
	{
		current = new Node(key);
		current.next = head;
		head = current;
	}

	//AFTER aa INSERT bb
	public void insertAfter(char aa, char bb)
	{
		Node tmp = new Node(bb); 							//node to be inserted
		while( current.key != aa && current.next != null)	//iterate forward
		{
			current = current.next;
		}
		if( current.key == aa)
		{
			tmp.next = current.next;
			current.next = tmp;
		}
		else
		{
			System.out.println("not found");
		}
		current = head;
	}

	public void delete(char kk)
	{
		System.out.println("Delete " + kk);
		if(head.key == kk)
		{
			head = head.next;
			current = head;
		}
		while( current.next != null)
		{
			if(current.next.key == kk)
			{
				current.next = current.next.next;
			}
			current = current.next;
		}
		current = head;
	}


	public void print()
	{
		current = head;
		while(current != null)
		{
			current.print();
			current = current.next;
		}
		current = head;
	}
}