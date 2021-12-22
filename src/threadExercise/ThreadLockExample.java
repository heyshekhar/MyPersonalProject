package threadExercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadLockExample {
	ReentrantLock lock = new ReentrantLock();
	private int countReentrantLock = 0;
	
	
	ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private int countReadWriteLock = 0;
	
	public static void main(String arg[]) {
		ThreadLockExample threadLockObj = new ThreadLockExample();
		
		
		//reentrant lock example
//		threadLockObj.threadReentrantLockExample();
		
		//read write lock example
		threadLockObj.threadReadWriteExample();
		
	}

	private void threadReadWriteExample() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		executorService.execute(() -> {applyWriteLock();});
		executorService.execute(() -> {applyWriteLock();});
		
		executorService.execute(() -> {applyWriteLock();});
		
		executorService.execute(() -> {readValuefromReadWriteLockLock();});
		executorService.execute(() -> {readValuefromReadWriteLockLock();});
		executorService.execute(() -> {readValuefromReadWriteLockLock();});
		
		executorService.shutdown();
		
	}

	

	private void applyWriteLock() {
		readWriteLock.writeLock().lock();
		try {
			countReadWriteLock = countReadWriteLock+1;
			System.out.println("current thread : "+Thread.currentThread().getName());
		} finally {
			System.out.println("\n ------------------------------------------------");
			readWriteLock.writeLock().unlock();
		}
		
	}

	private int readValuefromReadWriteLockLock() {
	
		readWriteLock.readLock().lock();
		try {
			System.out.println("reading value from read write thread counter : "+countReadWriteLock+"\n Thread :"+Thread.currentThread().getName()+
					"\n ------------------------------------------------");
			return countReadWriteLock;
		}finally {
//			readWriteLock.readLock().unlock();
			
		}
		
	}
	
	private void threadReentrantLockExample() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		executorService.execute(() -> {applyReentrantLock();});
		executorService.execute(() -> {applyReentrantLock();});
		executorService.execute(() -> {applyReentrantLock();});
		
		executorService.shutdown();
	}

	private void applyReentrantLock() {
		
		lock.lock();
		try {
			Thread.sleep(1000);
			countReentrantLock = countReentrantLock + 1;
			System.out.println("current thread : "+Thread.currentThread().getName());
		}catch(Exception e) {
			System.out.println(e.getCause());
		} finally {
			lock.unlock();
			System.out.println("release lock of thread : "+Thread.currentThread().getName()+
							"\n ------------------------------------------------");
		}

	}
}
