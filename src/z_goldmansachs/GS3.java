package src.z_goldmansachs;

import java.util.Scanner;

public class GS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch ="MMNM";
		int num = findDigits(ch);
		System.out.println(num);
	

	}

	private static int findDigits(String str) {
		
		System.out.println(str);
		String strNum = ""; 	
		boolean success = true; String first = "21",second = "3";
		int mCount = 0, nCount = 0;
		if(str == null || str.isEmpty())
		{
			return -1;
		}
		else
		{
			for(int i =0; i<str.length(); i++)
			{
				if(str.charAt(i) != 'M' && str.charAt(i) != 'N')
				{
					return -1;
				}
				else
				{
					if(str.charAt(i) == 'M')
					{
						nCount = 0;
						if(strNum.isEmpty())
						{
							strNum = "21";
							mCount++;
						}
						else
						{
							success = true;
							if(mCount == 0)
							{
								strNum = addNumber(success,first,strNum,"M");
								mCount++;
							}
							else
							{
								strNum = addNumberTwo(success,first,strNum,"M");
								mCount++;
							}
						}
						
					}
					else if(str.charAt(i) == 'N')
					{
						mCount = 0;
						if(strNum.isEmpty())
						{
							strNum = "12";
							nCount++;
						}
						else
						{
							
							success = true;
							if(nCount == 0)
							{
								strNum = addNumber(success,second,strNum,"N");
								nCount++;
							}
							else
							{
								strNum = addNumberTwo(success,second,strNum,"N");
								nCount++;
							}
						}
						
					}
				}
			}
		}
		return (int)Integer.parseInt(strNum);
	}

	private static String addNumberTwo(boolean success, String num, String strNum,String check) {

		while(success)
		{
			if(!strNum.contains(num))
			{
				if(check.equals("M"))
				{
					strNum = num+strNum;
					success = false;
				}
				else
				{
					strNum = strNum+num;
					success = false;
				}
				
			}
			else
			{
				if(check.equals("M"))
				{
					num =String.valueOf((num.charAt(0)-'0')+1);
				}
				else
				{
					num =String.valueOf((num.charAt(num.length()-1)-'0')+1);
				}
				
				
			}
		}
		
		return strNum;
		
		
	}

	private static String addNumber(boolean success, String num, String strNum,String check) {
		
		while(success)
		{
			if(!strNum.contains(num))
			{
				strNum = strNum+num;
				success = false;
			}
			else
			{
//				if()
				num = (String.valueOf((num.charAt(num.length()-1)-'0')+2));
				
			}
		}
		
		return strNum;
	}

}
