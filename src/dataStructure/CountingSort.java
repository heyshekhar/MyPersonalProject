package dataStructure;

public class CountingSort {

	public static void main(String[] args) {
	
		countSortExample();

	}

	private static void countSortExample() {

		int arr[] = {9,1,1,2,5,6,2,2,5,3,8,9};
		int maxNum = findMaxNum(arr);
		
		int count[] = new int[maxNum+1];
		
		for(int i=0; i<arr.length; i++) {
			++count[arr[i]];
		}
		
		int index = 0;
		for (int i = 0; i < count.length; i++) {
				for (int j = 0; j < count[i]; j++) {
					arr[index] = i;
					index++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	private static int findMaxNum(int[] arr) {
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
