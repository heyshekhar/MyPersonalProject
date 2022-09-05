package normalexample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AnagramExp {

	
	public static void main(String arg[])
	{
		
		/*
		 * An anagram of a string is another string that contains the same characters,
		 * only the order of characters can be different. For example, �abcd� and �dabc�
		 * are an anagram of each other.
		 */
		String Fname = "Shekhar";
		String Sname = "shekfhar";
		
		//CompaireWord_Array(Fname,Sname);
		
		Fname = "sheaakhar";
		Sname = "rahkehs";
		
		//CompaireWord_Hashmap(Fname,Sname);
		
		CompaireWord_Hashmap2(Fname,Sname);
		
		Fname = "shekhar";
		Sname = "shekahr";
		
//		CompaireWord_Hashset(Fname,Sname);
		
		
	}
	
	private static void CompaireWord_Hashmap2(String fname, String sname) {
		Map<Character, Integer> hm1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hm2 = new HashMap<Character, Integer>();
		
		for(int i =0; i<fname.length(); i++) {
			char ch = fname.charAt(i);
			if(hm1.containsKey(ch)) {
				hm1.put(ch, hm1.get(ch)+1);
			}else {
				hm1.put(ch, 1);
			}
		}
		
		for(int i =0; i<sname.length(); i++) {
			char ch = sname.charAt(i);
			if(hm1.containsKey(ch)) {
				if(hm1.get(ch) > 0) {
					hm1.put(ch, hm1.get(ch)-1);
				}else {
					System.out.println("both string are not anagram");
					break;
				}
				
				if(hm1.get(ch) == 0) {
					hm1.remove(ch);
				}
			}else {
				System.out.println("both string are not anagram");
				break;
			}
		}
		
		if(hm1.isEmpty()) {
			System.out.println("both string are anagram");	
		}else {
			System.out.println("both string are not anagram");
		}
		
		
		
	}

	public static void CompaireWord_Array(String Fname,String Sname)
	{
		//Removing all white spaces from s1 and s2
		 
        String copyOfs1 = Fname;
 
        String copyOfs2 = Sname;
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
 
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
            
            System.out.println(s1Array);
            System.out.println(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        if(status)
        {
            System.out.println(Fname+" and "+Sname+" are anagrams");
        }
        else
        {
            System.out.println(Fname+" and "+Sname+" are not anagrams");
        }
	}
	
	public static void CompaireWord_Hashmap(String Fname,String Sname)
	{
		Map<Character, Integer> Fhp = new HashMap<Character, Integer>();
		Map<Character, Integer> Shp = new HashMap<Character, Integer>();
		
		 Fname = Fname.replaceAll("\\s", "");
		 Sname = Sname.replaceAll("\\s", "");
        
		char[] Fch = Fname.toLowerCase().toCharArray();
		char[] Sch = Sname.toLowerCase().toCharArray();
		
		boolean Success = true;
		
		for(char c: Fch)
		{
			if(Fhp.containsKey(c))
			{
				Fhp.put(c, Fhp.get(c)+1);
			}
			else
			{
				Fhp.put(c, 1);
			}
		}
		
		for(char c: Sch)
		{
			if(Shp.containsKey(c))
			{
				Shp.put(c, Shp.get(c)+1);
			}
			else
			{
				Shp.put(c, 1);
			}
		}
		
		System.out.println(Fhp);
		System.out.println(Shp);
		System.out.println(Fname.length());
		System.out.println(Sname.length());
		
		if(Fname.length()!=Sname.length())
		{
			Success = false;
		}
		else
		{
			for(Map.Entry<Character, Integer> s : Shp.entrySet())
				{
//				System.out.println(s);
					if(Fhp.containsKey(s.getKey()))
					{
						Success = true;
//						System.out.println(Fhp.get(s.getKey()));
						if(Fhp.get(s.getKey())==s.getValue())
						{
							Success = true;
						}
						else
						{
							Success = false;
							break;
						}
					}
					else
					{
						Success = false;
						break;
					}
				}
				
			}
		
		
		if(Success == true)
		{
			System.out.println("both String are Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	
	}
	
	public static void CompaireWord_Hashset(String Fname,String Sname)
	{
		String Fn = Fname.replaceAll("\\s", "");
		String Sn = Sname.replaceAll("\\s", "");
		boolean status = true;
		if(Fn.length() != Sn.length())
			{
				status = false;
			}
		else
		{
			Set<String> fst = new TreeSet<String>();
			Set<String> sst = new TreeSet<String>();
			
			for(int i=0;i<Fn.length();i++)
			{
				fst.add(""+Fn.toLowerCase().charAt(i));
			}
			for(int i=0;i<Sn.length();i++)
			{
				sst.add(""+Sn.toLowerCase().charAt(i));
			}
//			fst.add(Fn.toLowerCase());
//			sst.add(Sn.toLowerCase());
			
			
			System.out.println(fst);
			System.out.println(sst);
			
			if(fst.equals(sst))
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		
		if(status)
		{
			System.out.println("Kuch bhi");
		}
		else 
		{
			System.out.println("haa na");
		}
	}
}
