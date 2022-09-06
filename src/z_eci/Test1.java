package z_eci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;

import pojoClass.UserDetails;

public class Test1 {

			
	 private static short k =1;
	 private static short l =2;
	 private static short m =4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
        Set<Integer> neps = new HashSet<>();
        Collections.addAll(neps, 10, 12);
        
       // System.out.println(neps);
        
        //System.out.println(String.format("%d-%d-%d",k,l,m));
        
        Set<String> set = new HashSet<>();
        
        set.add("shekhar");
        set.add("rathore");
        set.add("bittu");
        
        set.stream().forEach(n ->
        	{
        		//System.out.println("name : "+n);
        	});
        UserDetails userDetails1 = new UserDetails("shekhar", "marathalli", 88888);
		UserDetails userDetails2= new UserDetails("lokesh", "BTM", 9999);
		
		ArrayList<UserDetails> uDetails = new ArrayList<>();
		uDetails.add(userDetails1);
		uDetails.add(userDetails2);
		
		
		String s = "[\""+"0000000-0000-0000-0000-0000000000ce"+","+"00000000-0000-0000-0000-00000000005d"+"\"]";
		String str[] = s.split(",");
		
		for(String UUID:str)
        {
			String str1[] = UUID.split("\"");
			for(String nUUID:str1)
	        {
				System.out.println("nUUID : "+nUUID);
				
				if(!Pattern.matches("[\\[\\]\\s]", nUUID))
				{
					System.out.println("is numeric"+nUUID);
				}
				
	        }
            
        }
		
		str = str[0].split("\"");
		String str1[] = {"00000000-0000-0000-0000-000000000679", 
						"00000000-0000-0000-0000-000000000675"};
		
		String[] arr = ArrayUtils.toArray(s);
       /* for(String s : str)
        {
        	System.out.println("print s value "+s);
        	if(ArrayUtils.contains(str1, s))
        	{
        		System.out.println("array matched {} with value {}");
        	}
        }*/
		}
}
