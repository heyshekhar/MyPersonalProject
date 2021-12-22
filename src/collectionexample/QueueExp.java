package collectionexample;

import java.util.PriorityQueue;

public class QueueExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		
		pq.poll();
		pq.peek();
		System.out.println(pq);
		
		OuterClass outerClass = new OuterClass();
		
		outerClass.display();
		
		OuterClass.StaticInnerClass outerClass1 = new OuterClass.StaticInnerClass();
		outerClass1.display();
	}

}

class OuterClass
{
	int a=10;
	static class StaticInnerClass
	{
		public void display()
		{
			System.out.println("inside static inner class");
		}
	}
	
	
	public static void staticMethod()
	{
		System.out.println("static method inside main class");
	}
	 class NonStaticClass
	{
		public void nonstaticMethod()
		{
			System.out.println("static method inside inner class "+a);
		}
	}
	public void display()
	{
		class InnerClass
		{
			public void show()
			{
				System.out.println("inside innerclass");
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.show();
		
		NonStaticClass nonStaticClass = new NonStaticClass();
		nonStaticClass.nonstaticMethod();
		
	}
}
