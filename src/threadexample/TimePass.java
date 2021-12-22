package threadexample;

import java.util.HashMap;

public class TimePass {

	static HashMap<Integer, Integer> hm = new HashMap<>();
	static int count = 0;
	static class HashMapAddition extends Thread
	{
		HashMap<Integer, Integer> hm; int key,value;
		public HashMapAddition(HashMap<Integer, Integer> hm,int key,int value)
		{
			this.hm = hm;
			this.key = key;
			this.value = value;
		}
		
		public void run()
		{
			synchronized (hm) {
				
				System.out.println(Thread.currentThread().getName());
				hm.put(key, value);
				count++;
				try {hm.wait();}catch(Exception e) {System.out.println(e.getMessage());}
				hm.notifyAll();
				try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e.getMessage());}
				
			}
		}
	}
	
	static class HashMapGetValue extends Thread
	{
		HashMap<Integer, Integer> hm; int key;
		public HashMapGetValue(HashMap<Integer, Integer> hm,int key)
		{
			this.hm = hm;
			this.key = key;
		}
		
		public void run()
		{
			if(count>0)
			{					
				System.out.println(Thread.currentThread().getName());
				System.out.println(hm.get(key));
				count--;
			}	
		}
	}
	public static void main(String[] args) {
		
		
		
//		HashMapAddition addition = new HashMapAddition(hm, 3, 5);
//		
//		HashMapGetValue getValue = new HashMapGetValue(hm, 3);
//		
//		addition.start();
//		getValue.start();

		
		addingZeroOnNumber();
	}
	private static void addingZeroOnNumber() {
		int num = 999;
		int a = 0000;
		
		System.out.println(num+a);
		
	}

}
