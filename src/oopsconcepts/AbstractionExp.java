package oopsconcepts;

public class AbstractionExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalClass finalClass = new FinalClass();
	}

}

class FinalClass
{
	final void show()
	{}
}

abstract class abstractexamp
{
	abstractexamp()
	{
		System.out.println("inside abstract method");
	}
	
}

abstract class SubClass extends abstractexamp
{
	
}
interface interfaceexamp
{
//	public interfaceexamp
//	{
//		
//	}
}


