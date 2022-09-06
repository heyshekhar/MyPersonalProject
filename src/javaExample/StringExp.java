package javaExample;

import java.util.Arrays;
import java.util.List;

public class StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverString();
		
//		subString();
		
//		firstNonRepeatedCharacter();
		
		String sNum = "-12365";
		int num=convertStringIntoInteger(sNum);
		System.out.println(num);
		
		System.out.println(sNum.charAt(0)-'0');
		
	}

	private static int convertStringIntoInteger(String str) {
		
		        int i = 0, number = 0;
		        boolean isNegative = false;
		        int len = str.length();
		        if( str.charAt(0) == '-' ){
		            isNegative = true;
		            i = 1;
		        }
		        while( i < len ){
		            number *= 10;
		            number += ( str.charAt(i++) - '0' );
		        }
		        if( isNegative )
		        number = -number;
		        return number;
		    }  
		
	

	private static void firstNonRepeatedCharacter() {
		
		String str= "LoveYourself";
		String nStr = null;
		str=str.toLowerCase();
		for(int i=0; i<str.length(); i++)
		{
			String s =str.substring(0,i);
			nStr = str.substring(0,i)+str.substring(i+1,str.length());
			if(!nStr.contains(String.valueOf(str.charAt(i))))
			{
				System.out.println("first non repeated character is : "+str.charAt(i));
				break;
			}
		}
		
		
		
	}

	private static void subString() {
		
		System.out.println("\n-----SubString Example-----");
		String name = "shekhar";
		
		System.out.println(name.substring(0,1));
		
		System.out.println(name.substring(2));
		
		System.out.println(name.substring(2,5));
		
		
		
	}

	private static void ReverString() {

		System.out.println("-----Reverse the string using n/2 loop-----");
		String name = "shekhar";
		System.out.println("Orignal String : "+name);
		
		char[] ch = name.toCharArray();
		int lent = name.length();
		for(int i=0; i<name.length()/2; i++){
			name = name.substring(0,i)+name.charAt(name.length()-(i+1))+
				   name.substring(i+1,name.length()-(i+1))+name.charAt(i)+
				   name.substring(name.length()-i);
		}
		
		System.out.println("Reverse String : "+name);
		
		for(int i=0; i<name.length()/2; i++){
			char c1 = ch[i];
			ch[i]= ch[ch.length-i-1];
			ch[ch.length-i-1] = c1;
		}
		
		System.out.println(String.valueOf(ch));
		
		String s = String.valueOf("reverse string using array : "+name.toCharArray());
		
	}
	

}
