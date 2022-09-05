package normalexample;

import java.util.HashMap;
import java.util.Map;


public class FindMatchInString {

	public static void main(String[] args) {
		String name = "YHKKADGFGFFADGJJJ";
		String match = "ADGFFF";
		int length = 0;
		int j = 0;
		int sub = FindMatching(j, name, match, length);
		String mat = match.substring(0, sub);

		System.out.println("matching string 1 :" + mat);

		// string pattern find
//	findMatchingStringTwo();

//	CountTotalNumberOfOccuranceOfSubString();

		CountTotalNumberOfOccuranceOfSubStringTwo();
	}
	
	private static void CountTotalNumberOfOccuranceOfSubStringTwo() {
		String name = "qwertyuiwertopqwertyuiwertop";
		String pattern = "rto";
		String matching=null;
		int count=0;
//		for(int i=0; i<pattern.length(); i++)
//		{
//			if(name.contains(pattern))
//			{
//					int index=name.indexOf(pattern);
//					System.out.println(index);
//				
//					StringBuilder sb = new StringBuilder(name);
//				
//					for(int j=0; j<pattern.length(); j++)
//					{
//						sb.deleteCharAt(index);
//					}
//				
//					name=String.valueOf(sb);
//					System.out.println(sb);
//					count++;i=0;
//			}
//			
//		}
		
		Boolean isCompleted = false;
		StringBuilder sb = new StringBuilder(name);
		while(!isCompleted) {
			if(name.contains(pattern))
			{
					int index=name.indexOf(pattern);
//					System.out.println(index);
					name = name.substring(index+pattern.length(), name.length());
				
//					System.out.println("new string : "+name);
					count++;
			}else {
				isCompleted = true;
			}
			
		}
		System.out.println("number of occurrence : "+count);
		
	}

	private static void CountTotalNumberOfOccuranceOfSubString() {
		String name = "ascdvgbascdvgb";
		String sub = "dvg";
		int count=0;
		int j=0;int i=0;
		count=FindCountInString(i,j,name,sub,count);
		System.out.println("total number of count of sub string : "+sub+" : "+count);
		
		
	}

	private static int FindCountInString(int i,int j, String name, String sub,int count) {
		int num=0;boolean status=true; boolean iCounter = true;
		while(i<sub.length())
		{
			while(j<name.length())
			{
//				System.out.println(name.charAt(j)+" "+sub.charAt(i));
				if(name.charAt(j)==sub.charAt(i))
				{
					num++;iCounter = true;j++;
					if(num==sub.length())
					{
						count++;
						i=0;iCounter = false;
						if(j>=name.length())
						{ 
							status = false;break;
						}
					}
					
					if(iCounter==true)
						i++;
					break;
				}
				else
				{
					num=0;j++;i=0;
					if(j>=name.length())
					{
						status = false;break;
					}
					FindCountInString(i,j, name, sub, count);
				}
			}
			
			if(status==false)
			{
				break;
			}
		}
		
//		System.out.println(count);
		return count;
	}

	public static void findMatchingStringTwo() {
		String name = "qwertyuiwertop";
		String pattern = "werererto";
		int a=0;
		String matching=null;
		for(int i=0; i<pattern.length(); i++) {
			if(name.contains(pattern.substring(a, i))) {
				matching=pattern.substring(a,i+1);
			}
			else {
				a=i;
			}
		}
		
		System.out.println("Matching string 2 : "+matching);
		
		int index=name.indexOf(matching);
		System.out.println(index);
		
		StringBuilder sb = new StringBuilder(name);
		
		for(int i=0; i<matching.length(); i++) {
			sb.deleteCharAt(index);
		}
		
		System.out.println(sb);
	}

	
	public static int FindMatching(int j, String name, String match, int length) {

		int num = 0;
		for (int i = 0; i < match.length(); i++) {
			while (j < name.length()) {
				if (match.charAt(i) == name.charAt(j)) {
					num++;
					j++;
					break;
				} else {
					if (num > length) {
						length = num;
					}
					j++;

					FindMatching(j,name,match,length);
				}
			}
		}
		return length;
	}
}


