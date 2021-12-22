package threadExercise;

import java.util.function.BiFunction;

public class LambdaExample {
	
	public static void main(String arg[]) {
		LambdaExample lmbExample = new LambdaExample();
		lmbExample.methodreferencesExample();
	}

	private void methodreferencesExample() {
		String val = "shekhar";
		
//		BiFunction<String, String> test =  LambdaExample::getStringValue;
		
	}

	public void getStringValue(String val) {
		System.out.println("value : "+val);
		
	}
}
