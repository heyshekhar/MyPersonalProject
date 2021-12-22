package src.threadexample;

public class EvenOddNumberExp {
	private static Object object;
	
	static class EvenNumber extends Thread
	{
		Object object;
		public EvenNumber(Object object){this.object = object;}
		public void run()
		{
			synchronized(object)
			{
				for(int i=0;i<=10;i++)
				{
					if(i%2==0)
					{
						System.out.println("even :"+i);
						try {
							object.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					object.notifyAll();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
	}

	static class OddNumber extends Thread
	{
		Object object;
		public OddNumber(Object object){this.object = object;}
		public void run()
		{
			synchronized(object)
			{
				for(int i=0;i<=10;i++)
				{
					if(i%2!=0)
					{
						System.out.println("odd :"+i);
						try {
							object.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					object.notifyAll();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}

	}
	public static void main(String arg[])
	{
		object = new Object();
		OddNumber odd = new OddNumber(object);
		EvenNumber even = new EvenNumber(object);
		even.start();
		odd.start();
		
	}
}

