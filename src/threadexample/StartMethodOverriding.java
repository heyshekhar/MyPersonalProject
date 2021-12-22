package threadexample;

public class StartMethodOverriding {

	public static void main(String arg[])
	{
		ThreadStartExp threadExp = new ThreadStartExp();
		threadExp.start();
		
		
	}
}

class ThreadStartExp extends Thread
{
	public void run()
	{
		System.out.println("inside run method...");
	}
	
	public void start()
	{
		super.start(); // if we are not calling super.start() then it will not call the run method
//		System.out.println("inside start method....");
	}
}