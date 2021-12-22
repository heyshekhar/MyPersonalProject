package threadexample;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	static class DisplyClass
	{
		private final ReentrantLock lock = new ReentrantLock(false);
		static int count =0;
		
		public int display()
		{
			lock.lock();
			try
			{
				System.out.println(Thread.currentThread().getName());
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				count++;
				return count;
				
			}
			finally
			{
				lock.unlock();
			}
		}	
	}
	
	class ThreadExecutor extends Thread
	{
		DisplyClass displyClass = new DisplyClass();
		public void run()
		{
			int count = displyClass.display();
			System.out.println(Thread.currentThread().getName()+" "+count);
		}
	}
	public static void main(String[] args) {
		ReentrantLockExample lockExp = new ReentrantLockExample();
		
		/*LockExp.DisplyClass displyClass = lockExp.new DisplyClass();
		int count = displyClass.display();
		
		System.out.println(count);*/

		ReentrantLockExample.ThreadExecutor threadExecutor = lockExp.new ThreadExecutor();
		ReentrantLockExample.ThreadExecutor threadExecutor1 = lockExp.new ThreadExecutor();
		ReentrantLockExample.ThreadExecutor threadExecutor2= lockExp.new ThreadExecutor();
		
		threadExecutor.start();
		threadExecutor1.start();
		threadExecutor2.start();
		
	}

}

