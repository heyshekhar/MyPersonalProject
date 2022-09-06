package threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSequenceExp {
		
public static void main(String arg[])
	{
		Runnable runnable = new ThreadExpexp();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(runnable);
		executorService.shutdown();
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(runnable);
		executorService1.shutdown();
		
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		executorService2.execute(runnable);
		executorService2.shutdown();
		
		ExecutorService executorService3 = Executors.newSingleThreadExecutor();
		executorService3.execute(runnable);
		executorService3.shutdown();
	}
}

class ThreadExpexp implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
