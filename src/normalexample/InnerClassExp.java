package normalexample;

public class InnerClassExp {

	class Inner
	{
		public void display()
		{
			System.out.println("inside inner class..");
		}
	}
	public static void main(String[] args) {
		
		InnerClassExp innerClassExp = new InnerClassExp();
		
		InnerClassExp.Inner inner = innerClassExp.new Inner();
		
		inner.display();
		

	}

}
	 