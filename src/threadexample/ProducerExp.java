package src.threadexample;

import java.util.ArrayList;
import java.util.List;

public class ProducerExp {
	
	static List<Integer> list = new ArrayList<Integer>();
	
	static class Producer extends Thread
	{
		List<Integer> list;
		public Producer(List<Integer> list) {this.list=list;}
		
		public void run()
		{
			synchronized(list)
			{
				for(int i=1; i<=10; i++)
				{
					if(list.size()>=5)
					{
						System.out.println("producer is waiting....");
						try {list.wait();}
						catch(Exception e) {System.out.println(e.getMessage());}
					}
					list.add(i);
					System.out.println("produce : "+i);
					list.notifyAll();
					try {Thread.sleep(500);}
					catch(Exception e) {System.out.println(e.getMessage());}
				}
			}
		}
	}
	
	static class Consumer extends Thread
	{
		List<Integer> list;
		public Consumer(List<Integer> list) {this.list=list;}
		
		public void run()
		{
			synchronized(list)
			{
				for(int i=1; i<=10; i++)
				{
					if(list.isEmpty())
					{
						System.out.println("Consumer is waiting....");
						try {list.wait();}
						catch(Exception e) {System.out.println(e.getMessage());}
					}
					int k = list.remove(0);
					System.out.println("Consume : "+k);
					list.notifyAll();
					try {Thread.sleep(500);}
					catch(Exception e) {System.out.println(e.getMessage());}
				}
			}
		}
	}

	public static void main(String arg[])
	{
		Producer producer = new Producer(list);
		Consumer consumer = new Consumer(list);
		
		producer.start();
		consumer.start();
	}
}
