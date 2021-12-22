package datastructureExp;

public class InsertionSortExp {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,7,9,5,2};
		insertionSortOne(arr);

	}

	private static void insertionSortOne(int[] arr) {
		int temp;
		for(int i=1; i<arr.length; i++)
		{
			for(int j=i; j>0; j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
