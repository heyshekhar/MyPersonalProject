package src.normalexample;

public class ClonableExp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ClonableTest test = new ClonableTest();
		test.id=10;
		ClonableTest testTwo = (ClonableTest)test.clone();

		System.out.println(testTwo.id);
	}

}

class ClonableTest implements Cloneable //if you not implement cloneable interface and you provied the clone method 
{										//then it will throw clonenotsupported exception
	int id;
	String name;
	
	//if you implement the Cloneable and if you not provided the clone method then also it will throw error like method clone
	// is not visible
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}