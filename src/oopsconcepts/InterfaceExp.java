package oopsconcepts;

interface interfaceExpOne
{
	public void display();
	public int i=10;
}

interface interfaceExpTwo
{
	public void display();
	int i=100;
}

interface interfaceExpThree extends interfaceExpOne,interfaceExpTwo
{
	public void display();
	int i=1000;
}

public class InterfaceExp implements interfaceExpOne{

	public void display()
	{
		System.out.println("pata ni kon sa method : "+interfaceExpOne.i+" "+interfaceExpTwo.i+" "+interfaceExpThree.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		InterfaceExp interfaceExp = new InterfaceExp();
		interfaceExp.display();
	}

}
