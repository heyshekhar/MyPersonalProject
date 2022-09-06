package threadexample;

public class SynchronizationExp {

	
	public static void main(String[] args) {
	
		System.out.println("creating two thread of same class it will apply lock..");
		SynchClass synchClass = new SynchClass();
//		SynchClass synchClass1 = new SynchClass();
		TestSynch testSynch = new TestSynch(synchClass);
		TestSynchTwo testSynchTwo = new TestSynchTwo(synchClass);
//		TestSynchTwo testSynchTwo = new TestSynchTwo(synchClass1);
		
		testSynch.start();
		testSynchTwo.start();

	}

}

//class TestSynch implements Runnable
class TestSynch extends Thread
{
	int i=100;
	SynchClass obj;
	public TestSynch(Object obj)
	{
		this.obj = (SynchClass) obj;
	}
	public void run()
	{
		obj.printValue(i);
		
	}
}

class TestSynchTwo extends Thread
{
	int i=200;
	SynchClass obj;
	public TestSynchTwo(Object obj)
	{
		this.obj = (SynchClass) obj;
	}
	public void run()
	{
		obj.show(i);
		
	}
}

class SynchClass 
{
	public synchronized void printValue(int num)
	{
		System.out.println("inside printValue method : "+num);
		try {Thread.sleep(10000);}catch(Exception e) {e.printStackTrace();}
	}
	
	public synchronized void show(int num) 
	{
		System.out.println("inside show method : "+num);
		try {Thread.sleep(10000);}catch(Exception e) {e.printStackTrace();}
	}
}
