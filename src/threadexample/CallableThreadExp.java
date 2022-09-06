package threadexample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableThreadExp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Callable<String> callable = new CallableExp();
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future<String> future = executorService.submit(callable);
		
		System.out.println(future.get());
		
		//second way to call callable class
		
		FutureTask<String> futureTask = new FutureTask<>(callable);
		
		futureTask.run();
		
		System.out.println(futureTask.get());
		
		//Third way to call callable class
		
		ExecutorService executorService2 = Executors.newFixedThreadPool(10);
		
		futureTask = (FutureTask<String>) executorService2.submit(callable);
		
		for(int i=0; i<50; i++)
		{
			futureTask.run();
			System.out.println(futureTask.get());
		}
		
		executorService.shutdown();
		executorService2.shutdown();
		
	}

}

class CallableExp implements Callable<String>
{
	public String call() throws Exception
	{
		return "shekhar";
	}
}