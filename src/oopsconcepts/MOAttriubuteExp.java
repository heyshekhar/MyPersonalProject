package oopsconcepts;

public class MOAttriubuteExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassOverride subClassOverride = new SubClassOverride();
		SuperClassOverride superClassOverride=(SuperClassOverride)subClassOverride.display();
		
		System.out.println(superClassOverride.data);
		
		subClassOverride = (SubClassOverride)superClassOverride.display();
		
		System.out.println(subClassOverride.data);
		
		SubClassOverride subClassOverride1 = new SubClassOverride();
		System.out.println(subClassOverride1.data);
	}

}

class SuperClassOverride
{
	int data = 10;
	/*public Object display()
	{
		SubClassOverride override = new SubClassOverride();
		return override;
	}*/
	
	public SuperClassOverride display()
	{
		return new SuperClassOverride();
	}
}
class SubClassOverride extends SuperClassOverride
{
	int data =20;
	/*public Object display()
	{
		SuperClassOverride override = new SuperClassOverride();
		return override;
	}*/
	
	public SubClassOverride display()
	{
		return new SubClassOverride();
	}
}
