package threadexample;

public class SynchronizationExp2 {

	
	public static void main(String[] args) {
		
		/*System.out.println("creating two thread of same class it will apply lock..");
		SynchStaticClass synchClass = new SynchStaticClass();
		TestSynchStatic TestSynchStatic = new TestSynchStatic(synchClass);
		TestSynchStaticTwo TestSynchStatic4 = new TestSynchStaticTwo(synchClass);
		
		TestSynchStatic.start();		
		TestSynchStatic4.start();	*/	

		
		System.out.println("creating two thread of different class it will apply lock..");
		SynchStaticClass synchClass = new SynchStaticClass();
		SynchStaticClass synchClass2 = new SynchStaticClass();
		TestSynchStatic TestSynchStatic = new TestSynchStatic(synchClass);
		TestSynchStaticTwo TestSynchStatic4 = new TestSynchStaticTwo(synchClass2);
		
		TestSynchStatic.start();		
		TestSynchStatic4.start();
	}

}

class TestSynchStatic extends Thread
{
	int i=100;
	SynchStaticClass obj;
	public TestSynchStatic(Object obj)
	{
		this.obj = (SynchStaticClass) obj;
	}
	public void run()
	{
		obj.printValue(i);
		
	}
}

class TestSynchStaticTwo extends Thread
{
	int i=200;
	SynchStaticClass obj;
	public TestSynchStaticTwo(Object obj)
	{
		this.obj = (SynchStaticClass) obj;
	}
	public void run()
	{
		obj.show(i);
		
	}
}

class SynchStaticClass 
{
	public static synchronized void printValue(int num)
	{
		System.out.println(num);
		try {Thread.sleep(10000);}catch(Exception e) {e.printStackTrace();}
	}
	
	public static synchronized void show(int num) /* if i will remove static from method on any of the class any try to run 
													then they will run perfactly*/
	{
		System.out.println(num);
		try {Thread.sleep(10000);}catch(Exception e) {e.printStackTrace();}
	}
}