import java.util.Scanner;

public class SinglyLinkedListReverse{
	private static class Node{
	private int element;
	private Node next;
	public Node(int e, Node n)
	{
		element=e;
		next=n;
	}
	public int getElement()
	{
		return element;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node n)
	{
		next =n;
	}
	public void DisplayNode()
	{
		System.out.print("{"+element+"}");
	}
}
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	public SinglyLinkedListReverse(){}//empty constructor
	public int size()
	{
	return size;
	}
	public boolean isEmpty()
	{
	return size==0;
	}
	public void addFirst(int e)
	{
	head = new Node(e, head);
	if(size==0)
		tail=head;
	size++;
	}
	public void addLast(int e)
	{
	Node newest = new Node(e, null);
	if(isEmpty())
		head=newest;
	else
		tail.setNext(newest);
		tail=newest;
		size++;
	}
	public Node reverse()
	{
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current!=null)
		{
			next = current.next;
			current.next= previous;
			previous= current;
			current = next;
		}
		head = previous;
		return previous;
	}
	public void DisplayLinkedList()
	{
		System.out.println("First->Last");
		Node currentt = head;
		while(currentt!=null)
		{
			currentt.DisplayNode();
			currentt=currentt.getNext();
		}
		System.out.println("");
	}
	public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	SinglyLinkedListReverse obj1 = new SinglyLinkedListReverse();
	System.out.print("Enter the amount of First nodes u want to input: ");
	int countNodes = reader.nextInt();
	for(int i = 1; i<=countNodes; i++)
	{
		System.out.print("Enter the value of the node which will be added as first Node: ");
		int nodeNum = reader.nextInt();
		obj1.addFirst(nodeNum);
	}
	System.out.print("(Normal List)");
	obj1.DisplayLinkedList();
	System.out.print("(Reversed)");
	obj1.reverse();
	obj1.DisplayLinkedList();
}
}//end of the class


