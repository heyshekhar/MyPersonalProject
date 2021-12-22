package src.z_subex;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class SubexTest {

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,2,1};
		arrangeArray(arr);
		
		int ar[] = {3,4,4,6,6,6,7,7,7,8,9};
		arrangeArray(ar);
		
		int a[] = {2,2,2,2,2,2,2};
		arrangeArray(a);
	}

	private static void arrangeArray(int[] arr) {
		
		int num=arr[0];int count=0;
		Arrays.sort(arr);
		
		for(int i=1; i<arr.length; i++)
		{
			if(num!=arr[i])
			{
				num=arr[i];
				count=0;
			}
			else
			{
				if(arr[i]==num)
				{
					if(count>=1)
					{
						arr=ArrayUtils.remove(arr, i);
						i=i-1;
					}
					else
					{
						count++;
					}
				}
			}
			
		}
		
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]);
		}
		System.out.println("\n"+arr.length);
	}

}
