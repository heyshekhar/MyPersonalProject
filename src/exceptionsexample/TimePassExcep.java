package exceptionsexample;


public class TimePassExcep {
	public int check(int i)
	{
		try {
			i=100/0;
		}
		catch(ArithmeticException e)
		{
			i=200/0; //here it will throw the exception because 
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			i=300;
		}
		return i;
	}
	public static void main(String[] args) {
	
		TimePassExcep timePass = new TimePassExcep();
		int a= timePass.check(4);
		
		System.out.println(a);
	}
}
