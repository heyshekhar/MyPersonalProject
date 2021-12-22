package threadexample;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExp {

	public static void main(String[] args) {
		
		LockHashMap lockHashMap = new LockHashMap();
		LockHashMap lockHashMap1 = new LockHashMap();
		ReadOperation readOperation = new ReadOperation(lockHashMap,2);
		WriteOperation writeOperation = new WriteOperation(lockHashMap1,2,4);
		
		Thread r1 = new Thread(readOperation);
		Thread r2 = new Thread(readOperation);
		Thread r3 = new Thread(readOperation);
		Thread r4 = new Thread(readOperation);
		Thread r5 = new Thread(readOperation);
		Thread r6 = new Thread(readOperation);
		Thread r7 = new Thread(readOperation);
		
		Thread w1 = new Thread(writeOperation);
		Thread w2 = new Thread(writeOperation);
		
		w1.start();
		r1.start();
		r2.start();
		w2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		r7.start();
	}

}

class ReadOperation implements Runnable
{
	LockHashMap lockHashMap;int key;
	public ReadOperation(LockHashMap lockHashMap, int key)
	{
		this.lockHashMap = lockHashMap;
		this.key = key;
	}
	public void run()
	{
		try {
			lockHashMap.getValue(key);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WriteOperation implements Runnable
{
	LockHashMap lockHashMap;int key;int value;
	public WriteOperation(LockHashMap lockHashMap, int key, int value)
	{
		this.lockHashMap = lockHashMap;
		this.key = key;
		this.value = value;
	}
	public void run()
	{
		try {
			lockHashMap.addValue(key, value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class LockHashMap
{
	static HashMap<Integer, Integer> hm = new HashMap<>();
	private final static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private static final Lock read = lock.readLock();
	private static final Lock write = lock.writeLock();
	
	public Object addValue(int key, int value) throws InterruptedException
	{
		write.lock();
		try
		{
			System.out.println("write start into hashmap...");
			return hm.put(key, value);
		}
		finally
		{
			Thread.sleep(1000);
			System.out.println("write finish into hashmap...");
			write.unlock();
		}
	}
	
	public Object getValue(int key) throws InterruptedException
	{
		read.lock();
		try
		{
			System.out.println("fetching data from hashmap...");
			System.out.println(hm.get(key));
			return hm.get(key);
		}
		finally
		{
			Thread.sleep(1000);
			read.unlock();
		}
	}
	

}


