package dataStructure;

public class InsertionSort {

	public static void main(String[] args) {
		insertionSortExample();

	}

	private static void insertionSortExample() {
	    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
		for (int k = 1; k < 10; k++) {
			for (int j = 0; j < k; j++) {
				if (a[j] > a[k]) {
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}

//	        int temp = a[k];  
//	        int j= k-1;  
//	        while(j>=0 && temp <= a[j])     {  
//	            a[j+1] = a[j];   
//	            j = j-1;  
//	        }  
//	        a[j+1] = temp;  
		}  
	    System.out.println("printing sorted elements ...");  
	    for(int i=0;i<10;i++)    {  
	        System.out.print(" "+a[i]);  
	    }  

	}

}
