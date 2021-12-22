package oopsconcepts;

public class ThisKeywordExp {

	int idn;
	
	
	public ThisKeywordExp(int id)
	{
		
//		this //- Syntax error, insert "AssignmentOperator Expression" to complete  Assignment
		idn=id; //it will print 0 because 
		System.out.println("Sub class cunstructor");
	}
	{System.out.println("instance initializar block");}// Instance intializer block is invoked at the time of object creation. 
	//The java compiler copies the instance initializer block in the constructor after the first statement super(). 
	//So firstly, constructor is invoked.
	public ThisKeywordExp()
	{
		this(20); 
	}
	
	void display() 
	{
		this.idn = idn;
		System.out.println(idn);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordExp thisKeywordExp = new ThisKeywordExp(10);
		thisKeywordExp.display();
		
	}

}
