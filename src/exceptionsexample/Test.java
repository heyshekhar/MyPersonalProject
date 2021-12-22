package exceptionsexample;

public class Test {

	public static void main(String arg[]) {
		
		
//		throw new ArrayIndexOutOfBoundsException();
		
		try {
		throw new CustomException("my error", "customer error");
		}catch (CustomException ex) {
			ex.printStackTrace();
			
//			System.out.println(ex.getMessage());
		}
	}
}
