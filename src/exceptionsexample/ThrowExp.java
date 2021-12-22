package exceptionsexample;

import java.io.IOException;

public class ThrowExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if we are throwing runtime exception that time no need to extend exception class
//		throw new NullPointerException("message"); 

		/*// if we are throwing compile time exception that time need to extend exception class or use try catch block
		 try {
			throw new IOException("test"); 
		 		
		} catch (IOException e) { e.printStackTrace();}*/

		try
		{
			Thread.currentThread().getContextClassLoader();
		}
		 catch (Exception e)
		{
			 System.out.println(e.getMessage());
		}
	}
	

}
