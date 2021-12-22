package src.normalexample;

public class Timepass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name[] = {"a","b"};
		
//		String ch[] = new String[name.length];
		
		/*String num = "99.8";
		System.out.println(num.contains("."));
		String n[] = num.split(num, '.');
		System.out.println(n[0]);
		
		int num1 =0, pnum=0,nn=1;
		for(int i =0; i<5; i++)
		{
			num1 = num1+nn;
			nn=nn+1;
			
			System.out.println(num1);*/
			
			long check = 10;
//			int count = CountPlus(check);
//			System.out.println(count);
//		}
			
			String name = "3.3";
			
			long n = ' ';
			System.out.println(n);
			
			
//			System.out.println(num);
			
	}
	
	public static int CountPlus(long num)
	{

	 int check = 1;
	    int count =0;
	    int n = 1;
	    int cnum = 0;boolean success = true;
	    switch(check)
	    {
	    case 1:
	       if(num%2!=0)
	       {
	           count++;
	       }
	    case 2:
	        if(num%3==0)
	        {
	            count++;
	        }
	    case 3:
	        if(num%10==0 && (num/10)%2!=0 && (num/10)%3!=0)
	        {
	            count++;
	        }
	    case 4:
	        while(success)
	        {
	            if(num-cnum==0 && num%2!=0)
	            {
	                count++;
	                break;
	            }
	            else if(cnum>num)
	            {
	                break;
	            }
	            else
	            {
	                cnum=cnum+n;
	                n=n+1;
	            }
	                
	        }
	        default:
	    }
	    return count;
}
}
