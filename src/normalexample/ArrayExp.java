package src.normalexample;

public class ArrayExp {

	public static void main(String[] args) {
		
//		reverseArray();

		arrayBackTracking();
	}

	private static void arrayBackTracking() {
		int arr[] = {2, 4, 6, 8};
		int num =8;
		
		for(int i=0; i<arr.length; i++)
		{
			findTotalSum(arr,num,arr[i]);
		}
		
	}

	private static void findTotalSum(int[] arr,int num, int numb) {
		
		boolean status;int sub =numb,a=0;
		int[] arry = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			status = true;
			while(status)
			{
				if(num-sub==0)
				{
					arry[a]=numb;
				}
				else if(num<sub)
				{
					break;
				}
				else
				{
					arry[a]=arr[i];
					sub=arr[i]+sub;
					a++;
				}
			}
		}
		
		for(int i=0; i<arry.length; i++)
		{
			System.out.println(arry[i]);
		}
		
	}

	private static void reverseArray() {
		
		int arry[] = {1,3,4,2,6,7,5};
		int a;
		int j =arry.length-1;
		for(int i=0; i<arry.length/2; i++)
		{
			a = arry[i];
			arry[i] = arry[j-i];
			arry[j-i] =a;
		}
		
		for(int i=0; i<arry.length; i++)
		{
			System.out.print(arry[i]+" ");
		}
		
	}

}
