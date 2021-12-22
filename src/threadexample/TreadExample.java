package threadexample;

public class TreadExample {
	
	TreadExample() {
	
	}

	public static void main(String[] args) {
		
//		overrideStartMethod();
		
		sleepMethodExample();

	}

	private static void sleepMethodExample() {
		SleepThreadExample ste = new SleepThreadExample();
		SleepThreadExample ste1 = new SleepThreadExample();
		ste.start();
		ste1.start();
	}

	private static void overrideStartMethod() {
		
		Thread ts = new Thread() {
			
			@Override
			public void start() {
				super.start();
			}
			
			@Override
			public void run() {
				System.out.println("start method override example..."); 

			}
			
			
		};
		
		ts.start();
		
	}

}

class SleepThreadExample extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			if(i==5) {
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		} 

	}
}
