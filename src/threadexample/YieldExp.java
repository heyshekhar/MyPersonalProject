package threadexample;

public class YieldExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();
		
		one.start();
		two.start();
	}

}

class ThreadOne extends Thread
{
	public void run()
	{
		System.out.println("calling yield method...");
		Thread.yield();
		System.out.println("yield completed...");
	}
}

class ThreadTwo extends Thread
{
	public void run()
	{
		try {Thread.sleep(100);}
		catch(Exception e) {System.out.println(e.getMessage());}
		System.out.println("Call by yield method..");
		
	}
}