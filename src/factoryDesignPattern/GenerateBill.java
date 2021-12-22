package factoryDesignPattern;

public class GenerateBill {

	public static void main(String[] args) {
		
		String planType = "domestic";
		
		Plan planObj = getGenratedFactory(planType);
		
		planObj.getRate();
		planObj.calculateBill(5);
	}
	
	public static Plan getGenratedFactory(String planType) {
		if(planType.isEmpty()) {
			return null;
		}else if(planType.equalsIgnoreCase("domestic")) {
			return new DomesticPlan();
		}else if(planType.equalsIgnoreCase("international")) {
			return new InternationalPlan();
		}else {
			return null;
		}
		
	}

}
