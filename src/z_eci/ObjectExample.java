package z_eci;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClass.EciDetails;
import pojoClass.StudentDetails;



public class ObjectExample {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		EciDetails eciDetails = new EciDetails(10,"ECI");
		EciDetails eciDetails1 = new EciDetails(1,"ECI-RIBBON");
		StudentDetails studentDetails = new StudentDetails(11, "shekhar");
		
		List<EciDetails> details = new ArrayList<>();
		
		details.add(eciDetails);
		details.add(eciDetails1);
		
		
		
		List<Object> listTest = new ArrayList<>();
		
		listTest.add(details);
		listTest.add(studentDetails);
		
		
		 List<EciDetails> testEci = (List<EciDetails>)listTest.get(0);
		 testEci.forEach(e -> {
			// System.out.print(e.getNumber());
			// System.out.print(" "+e.getName()+"\n");
		 });
		 
		 
		 ObjectMapper oMapper = new ObjectMapper();
		 try {
		 
		 oMapper.writeValueAsString(details);
		 System.out.println(oMapper);
		 }
		 catch(Exception e)
		 {}
		 
		
		
		
		
		
		
	}

}
