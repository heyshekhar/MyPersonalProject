package oopsconcepts;

import java.util.ArrayList;
import java.util.List;

public class TimePass
{
	static int notify = 1;
	static
	{
		StaticChecker checker = new StaticChecker();
		checker.display();
	}
	
	public void display() throws InterruptedException
	{
		wait(notify);
		System.out.println(notify);
			
		
	}
	public static void main(String arg[]) throws Throwable
	{
		TimePass timePass = new TimePass();
		timePass.display();
		
	}
}

class StaticChecker
{
	public void display()
	{
		System.out.println("static method inside staticchecker class");
	}
}