package threadExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadPoolExample {

	public static void main(String arg[]) {
		
//		executorCollableExample();
		
		executorRunnableExample();
	}
	
	private static void executorRunnableExample() {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		executorService.execute(() -> {
			System.out.println("inside first execute method "+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		executorService.execute(() -> {
			System.out.println("inside seconf execute method"+Thread.currentThread());
		});
		
		executorService.shutdown();
		
		
	}

	private static void executorCollableExample() {

		
		ScheduledThreadPoolExecutor taskSchedulerExecutor = new ScheduledThreadPoolExecutor(20);
		System.out.println("number of thread :" +taskSchedulerExecutor.getCorePoolSize());
		
		List<Integer> neDtoList = new ArrayList<>();
		for(int i =0; i<10; i++) {
			neDtoList.add(i);
		}
		
		ThreadPoolExample threadPoolExample = new ThreadPoolExample();
		ExecutorService executor =  Executors.newFixedThreadPool(5);
		
		List<Future<Map<Integer, Boolean>>> futuresList = new ArrayList<>();
		for (Integer ne : neDtoList) {
			Future<Map<Integer, Boolean>> resultMap = executor.submit(new Callable<Map<Integer, Boolean>>() {
				@Override
				public Map<Integer, Boolean> call() throws Exception {
					Map<Integer, Boolean> asyncResultMap = new HashMap<>();
					Boolean result = false;
//						if (threadPoolExample.dummyCheckingMethod()) {
//							result = threadPoolExample.addNe();
//							asyncResultMap.put(ne, result);
//						} else {
//							asyncResultMap.put(ne, result);
//					}
					return asyncResultMap;
				}
				
			});
			futuresList.add(resultMap);
		}
		
		for(Future<Map<Integer, Boolean>> future:futuresList) {
			Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();
			
			try {
				result = future.get();
				
				System.out.println(result);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		executor.shutdown();
		
		
		for (Integer ne : neDtoList) {
			 CompletableFuture<Void> result = CompletableFuture.runAsync(() -> threadPoolExample.paramentDummy(ne))
					.thenApply(r -> threadPoolExample.addNe())
					.thenAccept(i -> completeValue(i));
		}
		
		
		
		
		
	
		
	}

	private static void completeValue(Boolean i) {
	
		System.out.println("sypply async : " +i);
	}

	public boolean paramentDummy(Integer ne) {
		return dummyCheckingMethod();
	}
	private Boolean addNe() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("adding ne : " +Thread.currentThread().getName());
		return true;
	}

	private boolean dummyCheckingMethod() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("active status checking : " +Thread.currentThread().getName());
		return true;
	}
}
