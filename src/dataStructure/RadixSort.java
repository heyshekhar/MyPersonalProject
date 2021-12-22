package dataStructure;

public class RadixSort {

	public static void main(String[] args) {
		
		radixSortExample();
		
//		radixSortExampleTwo();

	}

	private static void radixSortExampleTwo() {
		int a[] = { 170, 45, 75, 90, 802, 24, 2, 66, 9999, 5565,90,23,101,45,65,23,67,89,34,23 };
        radix_sort(a);    
        System.out.println("\n The sorted array is: \n");  
        for(int i=0;i<a.length;i++)  
            System.out.println(a[i]);  
		
	}

	private static void radix_sort(int[] a) {
		int bucket[][]=new int[10][10];  
        int bucket_count[]=new int[10];  
        int i, j, k, remainder, NOP=0, divisor=1, larger, pass;  
        larger = largest(a);  
        while(larger>0)  
        {  
            NOP++;  
            larger/=10;  
        }  
        for(pass=0;pass<NOP;pass++) // Initialize the buckets  
        {  
            for(i=0;i<10;i++)  
            bucket_count[i]=0;  
            for(i=0;i<10;i++)  
            {  
                // sort the numbers according to the digit at passth place            
                remainder = (a[i]/divisor)%10;  
                bucket[remainder][bucket_count[remainder]] = a[i];  
                bucket_count[remainder] += 1;  
            }  
            // collect the numbers after PASS pass  
            i=0;  
            for(k=0;k<10;k++)  
            {  
                for(j=0;j<bucket_count[k];j++)  
                {  
                    a[i] = bucket[k][j];  
                    i++;  
                }  
            }  
            divisor *= 10;  
        }  
		
	}
	
	public static int largest(int a[])  
    {     
        int larger=a[0], i;   
        for(i=1;i<10;i++)  
        {  
            if(a[i]>larger)  
            larger = a[i];  
        }  
        return larger;  
    } 

	private static void radixSortExample() {
		
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66, 9999, 5565,90,23,101,45,65,23,67,89,34,23 };
		 
		int maxNum = findMax(arr);
		
		int count = getDigitCounts(maxNum);
		
//		String[] newArr = addZerosBeforeNumber(arr, count);
		
		radixSort(arr, count);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	

	private static void radixSort(int[] arr, int count) {

		int div = 1;

		int secondArr[][] = new int[arr.length][arr.length];
		int newArr[];

		int index = 0;
		for (int i = 0; i < count; i++) {
			newArr = new int[10]; // for alphabet size will be 26
			for (int j = 0; j < arr.length; j++) {
				int reminder = (arr[j] / div) % 10;
				int countOfReminder = newArr[reminder];
				secondArr[reminder][countOfReminder] = arr[j];
				newArr[reminder] = countOfReminder + 1;
			}

			index = 0;
			for (int k = 0; k < newArr.length; k++) {
				for (int j = 0; j < newArr[k]; j++) {
					arr[index] = secondArr[k][j];
					index++;
				}
			}
			div = div * 10;

		}

//		
//		for (int i = 0; i < length; i++) {
//			for (int j = i + 1; j < length; j++) {
//				if (arr[i].charAt(at) > arr[j].charAt(at)) {
//					swap(arr, i, j);
//				}
//			}
//		}
//		while(i<newArr.length-1) {
//			if(newArr[i].charAt(at) > newArr[i+1].charAt(at)) {
//				swap(newArr,i);
//			}
//			i++;
//		}

//		if(at>0) {
//			radixSort(arr,length, count-1);
//		}

	}

	private static void swap(String[] newArr, int i, int j) {
		String s = "";
		s = newArr[i];
		newArr[i] = newArr[j];
		newArr[j] = s;
		
	}

	private static String[] addZerosBeforeNumber(int[] arr, int count) {

		String newArr [] = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			int num = getDigitCounts(arr[i]);
			int zeroCount = count - num;
			if(zeroCount > 0) {
				String val = String.format("%0"+(zeroCount+num)+"d", arr[i]);
				newArr[i] = String.valueOf(val);
			}else {
				
				newArr[i] = String.valueOf(arr[i]);
			}
			
		}
		return newArr;
	}
	
	private static int getDigitCounts(int maxNum) {
		
		int count = 0;
		while(maxNum != 0) {
			maxNum = maxNum/10;
			count++;
		}
		return count;
	}

	private static int findMax(int[] arr) {
		
		int max = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}

}
