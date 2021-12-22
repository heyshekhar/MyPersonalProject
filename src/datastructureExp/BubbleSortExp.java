package datastructureExp;

public class BubbleSortExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSortOne();
	}

	private static void BubbleSortOne() {
		
		int num[]= {1,5,27,3,4};
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]>num[j])
				{
					num[i]=num[i]+num[j];
					num[j]=num[i]-num[j];
					num[i]=num[i]-num[j];
				}					
			}
		}
		
		for(int j=0; j<num.length; j++)
		{
			System.out.print(num[j]+" ");					
		}
	}

}
