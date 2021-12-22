package src.normalexample;

public class JavaExample {

	public static void main(String arg[]) {
		
		arrayDupicationCount();
	}

	private static void arrayDupicationCount() {

		int arr[] = {1,3,4,2,5,1,1,6,5,5};
		int maxNum = findMaximmum(arr);
		int arrCount[] = new int[maxNum];
		
		for(int i =0; i<arr.length; i++) {
			int num = arr[i];
			int count = arrCount[num-1];
			
			arrCount[arr[i]-1] = count+1;
			
		}
		
		for(int i =0; i<arrCount.length; i++) {
			if(arrCount[i] != 0) {
				System.out.println(i+1+" total count : "+arrCount[i]);
				
			}
		}
	}

	private static int findMaximmum(int[] arr) {
		
		int max = 0;
		for(int i =0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
