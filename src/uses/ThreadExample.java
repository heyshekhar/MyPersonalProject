package uses;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadExample {
	
	private static Logger logger = LogManager.getLogger(ThreadExample.class);
	
	public static void main(String []arg) {
		
		ScheduledExecutorService taskSchedulerExecutor = Executors.newScheduledThreadPool(20);
		
//		logger.info("create total number of threadpull : "+taskSchedulerExecutor.ge());
		
		
	}

}
