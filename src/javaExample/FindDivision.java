package javaExample;

import java.util.HashSet;

public class FindDivision {

	
	public static void main(String[] args) {
//	Scanner s=new Scanner(System.in);
		
		int a =4;
		int b,c=a;
		HashSet<String> set = new HashSet();
		for(int i=1; i<=4; i++)
		{
			b=i;
			set=FindDivision(set,b,i,c);
		}
		
		System.out.println(set.size()+" "+set);
		
	}

	private static HashSet FindDivision(HashSet<String> set, int b, int i,int c) {
		
		while(b<=c)
		{
			if(i>1?b%i!=0:true)
			{
				if(i!=b)
				{
					set.add(i+"/"+b);
				}
			}
			b++;
		}
		return set;
	}
}
 



