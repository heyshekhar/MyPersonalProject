package threadExercise;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ExecutorServiceExample {
	
	private static Logger logger = LogManager.getLogger(ExecutorServiceExample.class);

	public static void main(String[] args) {
		
//		threadBlockingQueue();
		
//		executorExecuteExample(); 
		
		executorSubmitExample(); 
	}

	private static void executorSubmitExample() {
		logger.info("Executor submit example...");
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		//old way to execute thread pool
//		for (int i = 0; i <= 10; i++) {
//			Future<String> str = (Future<String>)executorService.submit(new SubmitExample());
//			try {
//				System.out.println(str.get());
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		for (int i = 0; i <= 10; i++) {
			Future<String> str = executorService.submit(() -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "submit" + Thread.currentThread();
			});
			
			try {
				System.out.println(str.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	private static void executorExecuteExample() {
		logger.info("Executor execute example...");
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		//old way to execute thread pool
		for (int i = 0; i <= 10; i++) {
//			executorService.execute(new ExecuteExample());
		}
		
		logger.info("Execute secon example...");
		for(int i=0; i<11; i++) {
			executorService.execute(() -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("current executing thread : "+Thread.currentThread());
			});
			
			//executorService.shutdown();
		}
	}

	private static void threadBlockingQueue() {
		logger.info("example blocking queue...");
		ExecutorService exRunAsyncService = Executors.newFixedThreadPool(10);
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);
		ExecutorProducer producer = new ExecutorProducer(bq);
		ExecutorConsumer consumer = new ExecutorConsumer(bq);
		
		exRunAsyncService.execute(producer);
		exRunAsyncService.execute(consumer);
	}

}


class ExecuteExample implements Runnable{
	
	public void run () {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("execute example : "+Thread.currentThread());
		}
}

class SubmitExample implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "submit"+Thread.currentThread();
	}
}
