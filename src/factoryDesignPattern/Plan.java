package factoryDesignPattern;

public abstract class Plan {

	protected int rate;
	
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println("rate : "+units*rate);
	}
}
