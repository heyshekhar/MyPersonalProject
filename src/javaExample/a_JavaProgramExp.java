package javaExample;

public class a_JavaProgramExp {

	public static void main(String... arg)
	{
		//PrimeNumberExp();
		
		FactorialNumberExp();
		
		//armstrongNumber();
	}

	private static void armstrongNumber() {
		
		
		/*
		 * Armstrong number is a number that is equal to the sum of cubes of its digits.
		 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try
		 * to understand why 153 is an Armstrong number. 153 = (1*1*1)+(5*5*5)+(3*3*3)
		 */
		
		int num=1634;
		int bnum = num;
		int pnum = 0,cnum=0;
		int length = String.valueOf(num).length();
		while(num!=0)
		{
			pnum=num%10;
			pnum=(int) Math.pow(pnum, length);
			cnum=cnum+pnum;
			num=num/10;
		}
		
		if(bnum == cnum) {
			System.out.println(bnum +" is armstrong number");
		}else {
			System.out.println(pnum +" is not armstrong number");
		}
	}
		
	

	private static void FactorialNumberExp() {
		
		int num=5;
		int fact =1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println("factorial number is : "+fact);
		
	}

	private static void PrimeNumberExp() {
		
		int num=13;
		int count =0;
		boolean success = true;
		for(int i=1; i<=13; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("given number is not prime");
		}
	}

	
}
