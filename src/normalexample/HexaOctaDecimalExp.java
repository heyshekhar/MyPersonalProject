package normalexample;

import java.util.Scanner;

public class HexaOctaDecimalExp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter any Hexa Chractor : ");
		String hexadecimal = sc.next();
		
		System.out.println("");
		//Converting Hexa decimal number to Decimal in Java
        int decimal = Integer.parseInt(hexadecimal, 16);
       //Convert binary to decimal Integer.parseInt(binaryNum,2);
        //Convert Octal to decimal Integer.parseInt(OctalNum,8);
        
        System.out.println("Converted Decimal number is : " + decimal);
    
        //Converting hexa decimal number to binary in Java       
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );
      
        // Converting Hex String to Octal in Java
        String octal = Integer.toOctalString(decimal);
        System.out.printf("Hexadecimal to Octal conversion of %s is %s %n", hexadecimal, octal );
		
		
		//Integer to Hexa conversion
		 Integer i = new Integer(2022333);
	     String hex = Integer.toHexString(i);
	     System.out.println("Hex value: "+hex);
	     
	     //Integer to decimal conversion
	     int num =13;
	     String decimal1 = Integer.toString(num);
			
		 System.out.println("Decimal Value is : " + decimal1);

	}

}
