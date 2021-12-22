package src.normalexample;

import java.util.HashMap;
import java.util.Map;

public class PailandromExp implements Cloneable {

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * Palindrome number in java: A palindrome number is a number that is same after
		 * reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome
		 * numbers. It can also be a string like LOL, MADAM etc.
		 */
		
		//check given String is pailandrom or not
//		PailandromOne();
		
		//Chech random String is pailandrom or not
//		PailandromTwo();
		
		PailandromExp exp = new PailandromExp();
		PailandromExp exp2 = (PailandromExp)exp.clone();
		
		exp2.PailandromOne();
	}

	private static void PailandromTwo() {
		
		String name = "aaabbcc";
		char ch[] = name.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		int count=0;
		
		for(char c:ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : mp.entrySet())
		{
			if(m.getValue()%2!=0)
			{
				count++;
				if(count>1)
				{
					System.out.println("Given String is not pailandrom..");
					break;
				}
			}
		}
		
		if(count<=1)
		{
			System.out.println("Given String is pailandrom...");
		}
	}

	private static void PailandromOne() {
		
		String name = "aadddaa";
		StringBuilder SName = new StringBuilder(name);
		String RName = SName.reverse().toString();
		
		System.out.println("String builder pailandrom : "+name.equals(RName));
		
		String ReName="";
		for(int i=name.length()-1;i>=0;i--)
		{
			ReName = ReName+name.charAt(i);
		}
		
		System.out.println(ReName.equals(name));
		
		for(int j=0; j<name.length()/2; j++)
		{
			if(!(name.charAt(j)==name.charAt(name.length()-(j+1))))
			{
				System.out.println("not pailandrom....");
			}
		}
	}
	

}
