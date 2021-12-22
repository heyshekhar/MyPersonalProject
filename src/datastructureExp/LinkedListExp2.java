package datastructureExp;

public class LinkedListExp2 {

	public NodeExp Head;
	public NodeExp2 headTwo;
	public LinkedListExp2() {
		Head = null;
		headTwo = null;
	}
	
	public void addElement(int data)
	{
		NodeExp n = new NodeExp(data);
		n.next = Head;
		Head = n;
	}
	
	public void display()
	{
		NodeExp currentNode = Head;
		Head = null;
		while(currentNode != null)
		{
			System.out.print(currentNode.data+" ");
			
			int value = currentNode.data;
//			System.out.println(value);
			NodeExp nodeExp = new NodeExp(value);
			nodeExp.next = Head;
			Head = nodeExp;
			currentNode=currentNode.next;
		}
		System.out.println(" ");
	}
	
	public void show()
	{
		NodeExp currentNode = Head;
		while(currentNode != null)
		{
			
			int value = currentNode.data;
			System.out.print(value+" ");
			currentNode = currentNode.next;
					
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListExp2 listExp2 = new LinkedListExp2();
		listExp2.addElement(2);
		listExp2.addElement(3);
		listExp2.addElement(4);
		
		listExp2.display();
		listExp2.show();
	}

}

class NodeExp
{
	int data;
	NodeExp next;
	
	public NodeExp(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class NodeExp2
{
	int data;
	NodeExp2 next;
	
	public NodeExp2(int data)
	{
		this.data = data;
		this.next = null;
	}
}