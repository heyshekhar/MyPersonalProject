package dataStructure;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		heapSortExampleOne();
	}

	private static void heapSortExampleOne() {

		int arr[] = {4, 10, 3, 5, 1,15,20,22};
		int arrLength= arr.length;
		for(int i = arrLength/2-1; i>=0; i--) {
			heapify(arr,arrLength, i);
		}
		for (int i=arrLength-1; i>=0; i--)  {  
		int temp = arr[0];  
		    arr[0]= arr[i];   
		    arr[i] = temp;   
		heapify(arr, i, 0);  
		}  
		
		for(int i=0; i<=arrLength-1; i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

	private static void heapify(int[] arr, int arrLength, int i) {

		int largest = i;
		int left = (2*i)+1;
		int right = (2*i)+2;
		
		if( left<arrLength && right<arrLength) {
			System.out.println("left :"+arr[left]+" right :"+arr[right]);
		}
		if(  left < arrLength && arr[left]>arr[largest]) {
			largest = left;
		}
		
		if( right<arrLength  && arr[right]>arr[largest]) {
			largest = right;
		}
		
		if(largest!=i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, arrLength, largest);
		}
	}

}
