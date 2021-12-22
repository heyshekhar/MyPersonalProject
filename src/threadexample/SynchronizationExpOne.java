package threadexample;

public class SynchronizationExpOne {

	public static void main(String[] args) {
		
		CallingMethod callingMethod = new CallingMethod();
		CallingMethod callingMethod1 = new CallingMethod();
		
		callingMethod.start();
		callingMethod1.start();
		SynchroExp synchroExp = new SynchroExp(callingMethod);
		
		SynchroExp synchroExp1 = new SynchroExp(callingMethod1);
		synchroExp.start();
		synchroExp1.start();
	}
}


class SynchroExp extends Thread
{
	CallingMethod callingMethod;
	public SynchroExp(CallingMethod callingMethod)
	{
		this.callingMethod = callingMethod;
	}
	public void run()
	{
		callingMethod.display();
	}
}

class CallingMethod extends Thread
{
	/*synchronized public void run()
	{
		System.out.println("shekhar");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}*/
	
	public static synchronized void display()
	{
		System.out.println("shekhar");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
