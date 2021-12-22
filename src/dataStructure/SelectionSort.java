package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
	
	public static void main(String arg[]) {
		
		selectionSortUsingArray();
		
//		selectionSortUseingList();
	}

	private static void selectionSortUsingArray() {
		
		System.out.println("***** selection sort ******");
		
		int arr[] = {4, 1, 5, 7, 2, 5, -9};
		
		System.out.print("input array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(temp > arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
					temp = arr[i];
				}
				
			}
		}
		System.out.print("\nshorted array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

	private static void selectionSortUseingList() {
		
		System.out.println("***** selection sort ******");
		
		List<Integer> arr = new ArrayList<>();
		arr.add(4); arr.add(1); arr.add(5); arr.add(2); arr.add(0);
		
		System.out.println("input list : "+arr);
		for(int i=0; i<arr.size(); i++) {
			int temp = arr.get(i);
			for(int j=i+1; j<arr.size(); j++) {
				if(temp > arr.get(j)) {
					arr.set(i,arr.get(j));
					arr.set(j, temp);
					temp = arr.get(i);
				}
				
			}
		}
		
		System.out.println("shorted list : "+arr);
		
	}

}
