package threadExercise;

import java.util.concurrent.BlockingQueue;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ExecutorConsumer implements Runnable {

//	Logger logger = LogManager.getLogger(ExecutorConsumer.class);
	public BlockingQueue<String> queue;
	
	public ExecutorConsumer(BlockingQueue<String> bq) {
		this.queue = bq;
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
			String msg;
			while (!(msg = queue.take()).equals("stop")) {
//				logger.info("Consuming value : "+msg);
				System.out.println("Tread: "+Thread.currentThread().getName()+" Consuming value : "+msg);
				Thread.sleep(1000);
			}
			
//			logger.info("task is completed");
			System.out.println("task is completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
