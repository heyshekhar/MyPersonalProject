package uses;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {
	
	private static Logger logger = LogManager.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
	
		boolean check = true;
		while (check) {
			System.out.println("Logger example start--- \n");

			logger.info("this is info example of logger");
			logger.debug("this is debug example of logger");
			logger.error("this is error example of logger");
			logger.fatal("this is fatal example of logger");

			System.out.println("\n ---end of logger example");
			
			System.out.println("want to continue select  y and n");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("n")) {
				check = false;
			}
		}
	}

}
