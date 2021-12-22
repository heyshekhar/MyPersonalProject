package src.normalexample;


public class TwoDimensionalArray {

	public static void main(String arg[])
	{
//		ArrayOne();
		
		ArrayTwo();
	}

	private static void ArrayTwo() {
		int num[][] = {{1,3,4,5},{6,3,4,5}};
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		
		for(int j=0; j<num[0].length; j++)
		{
			for(int i=0; i<num.length; i++)
			{
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	}

	private static void ArrayOne() {
		//check inside array if you find 1 then replace all row and column by 1
		int [][]number = {{2,2,3,5},{5,2,6,5},{8,5,4,5},{1,2,2,2},{4,5,1,9}};
		
		int [][]num = new int[number.length][number[0].length];
		boolean success = true;int i=0,j=0; int count =0;
		for(int x=0; x<number.length; x++)
		{
			for(int y=0; y<number[0].length; y++)
			{
				num[x][y]=number[x][y];
			}
			System.out.println();
		}
		while(success)
		{
				if(number[i][j]==1)
				{
					ArrayUpdation(num,number,i,j);
					if(i<number.length-1){i++;j=0;}
					else {j++;}
					
					if(i==number.length-1 && j==number[0].length-1)
					{
						success = false;
					}
				}
				else if(j==number[0].length-1)
				{
					if(i==number.length-1 && j==number[0].length-1)
					{
						success = false;
					}
					if(i<number.length-1)
					i++;j=0;
				}	
				else
				{
					if(j<number[0].length-1)
						j++;
				}
		}
		
		for(int x=0; x<num.length; x++)
		{
			for(int y=0; y<num[0].length; y++)
			{
				System.out.print(num[x][y]);
			}
			System.out.println();
		}
	}

	private static void ArrayUpdation(int[][] num, int[][] number,int i, int j) {
		int a=0,b=0;
		while(a<number.length)
		{
			num[a][j]=1;
			a++;
		}
		while(b<number[0].length)
		{
			num[i][b]=1;
			b++;
		}
		
	}
}
