package datastructureExp;

import org.apache.poi.hslf.blip.Metafile.Header;
import org.apache.poi.ss.formula.functions.MinaMaxa;

public class LinkedListExp {

	
	public Node head;
	public static int count=0;
	public LinkedListExp()
	{
		head=null;
	}
	
	public void intNode(int data)
	{
		Node nodeImplement = new Node(data);
		nodeImplement.next = head;
		head = nodeImplement;
	}
	
	public int deleteNode()
	{
		int temp = head.id;
		head = head.next;
		return temp;
	}
	public static void main(String[] args) { 
		
		LinkedListExp linkedListExp = new LinkedListExp();
		linkedListExp.intNode(2);
		linkedListExp.intNode(3);
		linkedListExp.intNode(5);
		linkedListExp.intNode(6);
		linkedListExp.intNode(6);
//		linkedListExp.display();
		
//		linkedListExp.deleteNode();
		int number = linkedListExp.display();
		System.out.println(number);
	}
	
	public int display()
	{
		Node currentNode = head;
		Node midNumber =head;
		int num = 0;
		while(currentNode != null)
		{
			currentNode = currentNode.next;
			if(num%2!=0)
			{
				midNumber = midNumber.next;
			}
			
			num++;
		}
		return midNumber.id;
	}
}

class Node
{
	int id;
	Node next;
	
	public Node(int id)
	{
		this.id=id;
	}
}

