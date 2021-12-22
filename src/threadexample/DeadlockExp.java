package src.threadexample;

import java.util.ArrayList;
import java.util.List;

public class DeadlockExp {

	public static void main(String arg[])
	{
		final String FName = "shekhar";
		final String LName = "rathore";
		
		Thread t1 = new Thread()
				{
					public void run()
					{
						synchronized(FName)
						{
							System.out.println("Holding FName : "+FName);
							try
							{
								Thread.sleep(10000);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
						synchronized(LName)
						{
							System.out.println("Holding LName : "+LName);
						}
						
					}
				};
				
		Thread t2 = new Thread()
				{
					public void run()
					{
						synchronized(LName)
						{
							System.out.println("Holding FName : "+LName);
							try
							{
								Thread.sleep(10000);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
						synchronized(FName)
						{
							System.out.println("Holding LName : "+FName);
						}
						
					}
				};
				
				t1.start();
				t2.start();
	}
}
