package threadExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureExample {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
//		completableFuturRunAsync();
	
//		completableFutureSupplyAsyncExample();
		
		//Eci project example
//		completableProjectExample();
		
		
		completableFutureCallBackExample();
		
	
	}

	private static void completableFutureCallBackExample() {
		ExecutorService exRunAsyncService = Executors.newFixedThreadPool(10);
		
		CompletableFuture.supplyAsync(() -> {
			return 10;
		}).thenApply(i -> {
			return i*10;
		}).thenRun(() -> {
			System.out.println("completed");
		}
			);
		
//		thenAccept(i -> {
//			System.out.println("output : "+i);
//		});
		
	}

	private static void completableFuturRunAsync() {
		ExecutorService exRunAsyncService = Executors.newFixedThreadPool(10);
//		for(int i = 1; i<10; i++) {
			exampleRunAsync(exRunAsyncService);
//		}
//		
//		
//		try {
//			System.out.println("out put of completable future : " +val.get());
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	private static void exampleRunAsync(ExecutorService exRunAsyncService) {
		
		ExecutorService exAsyncService = Executors.newFixedThreadPool(10);
		System.out.println("main thread : " +Thread.currentThread().getName());
		for (int i = 1; i < 10; i++) {
			CompletableFuture<Void> val = CompletableFuture.runAsync(() -> {
				System.out.println("thread : " + Thread.currentThread().getName());
//			for(int i = 1; i<10; i++) {
//				if(Thread.currentThread().getName().equals("5")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread : " + Thread.currentThread().getName());
//				System.out.println(Thread.currentThread().getName());
//			}

			}, exAsyncService);
		}
	
		
	}

	private static void completableFutureSupplyAsyncExample() {
		
		ExecutorService exService = Executors.newFixedThreadPool(10);
		
		CompletableFuture<String> val = CompletableFuture.supplyAsync(()-> {
			for(int i = 1; i<10; i++) {
//				if(i==5) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread());
//				}
			}
			return "shekhar";
			
		}, exService);
		
		val.complete("done");
		
		
		try {
			System.out.println("out put of completable future : " +val.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	private static void completableProjectExample() {
	
		List<Integer> neDtoList = new ArrayList<>();
		for(int i =0; i<10; i++) {
			neDtoList.add(i);
		}
		
		CompletableFutureExample threadPoolExample = new CompletableFutureExample();
		List<CompletableFuture<Boolean>> completeResultList = new ArrayList<>();
		for (Integer ne : neDtoList) {
			CompletableFuture<Boolean> completeResult = CompletableFuture.supplyAsync(() -> threadPoolExample.paramentDummy(ne))
					.thenApply(r -> threadPoolExample.addNe())
					.exceptionally(e -> {
						System.out.println("exception");
						return null;
					});
			completeResultList.add(completeResult);
		}
		
		completeResultList.forEach( r -> {
			try {
				System.out.println("checking the complete result : " +r);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			});		
		
		
			CompletableFuture<String> result = CompletableFuture.supplyAsync(() -> "checking suppy async task")
					.thenApply(s -> s + "  testing");

		try {
			System.out.println("testing complete future : "+result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public boolean paramentDummy(Integer ne)  {
		return dummyCheckingMethod();
	}
	private Boolean addNe() {
		
		System.out.println("came to add dummy ne");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("addNe : adding ne : " +Thread.currentThread().getName());
		return true;
	}

	private boolean dummyCheckingMethod() {
		System.out.println("can to checking the dummy ping");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dummyCheckingMethod: active status checking : " +Thread.currentThread().getName());
		return true;
	}

}
