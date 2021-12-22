package src.threadexample;

public class ThreadGroupExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExp ThreadExp1 = new ThreadExp();
		ThreadExp ThreadExp2 = new ThreadExp();
		ThreadExp ThreadExp3 = new ThreadExp();
		
		ThreadGroup group = new ThreadGroup("Thread Group");
		
		Thread t1 = new Thread(group, ThreadExp1);
		Thread t2 = new Thread(group, ThreadExp2);
		Thread t3 = new Thread(group, ThreadExp3);
		
		t1.start();t2.start();t3.start();
		group.suspend();
		group.resume();
		
	}

}


class ThreadExp implements Runnable
{
	public void run()
	{
		System.out.println("shekhar");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
}