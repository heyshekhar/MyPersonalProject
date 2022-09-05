package threadExercise;

import java.util.concurrent.BlockingQueue;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ExecutorProducer implements Runnable {

	//	Logger logger = LogManager.getLogger(ExecutorProducer.class);
	public BlockingQueue<String> queue;
	public ExecutorProducer(BlockingQueue<String> bq) {
		this.queue= bq;
	}

	public void run() {
		for(int i =0; i<=10; i++) {
			try {
//				logger.info("Adding value : "+i);
				System.out.println("Tread: "+Thread.currentThread().getName()+" Adding value : "+i);
				queue.put(""+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		logger.info("Producer task completed");
		System.out.println("Producer task completed");
		try {
			queue.put("stop");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
