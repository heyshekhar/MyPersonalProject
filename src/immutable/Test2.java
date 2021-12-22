package immutable;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

public static void main(String arg[]) {
		
		Address address = new Address("korba", "chhattisgarh");
		WithoutFinalClass w = new WithoutFinalClass(1,address);
		
		//when Student class is not defined as final
		Student s1 = w;
		Map<Student, String> map = new HashMap();
		map.put(s1, "shekhar");
		
		System.out.println(map.get(s1));
		
		w.setId(10); 
		
		System.out.println(map.get(s1));
	
//	System.out.println(null);
//	System.out.println((char[]) null);
		
		
		
	}

}
