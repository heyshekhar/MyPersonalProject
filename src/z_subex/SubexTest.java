package z_subex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

import org.apache.commons.lang3.ArrayUtils;

public class SubexTest {
	
//	static Logger log = Logger.getLogger(SubexTest.class);

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,2,1};
		removeDuplicatesFromArray_1(arr);
		removeDuplicatesFromArray_2(arr);
		removeDuplicatesFromArray_3(arr);
		removeDuplicatesFromArray_4(arr);
		removeDuplicatesFromArray_5(arr);
//		
//		int ar[] = {3,4,4,6,6,6,7,7,7,8,9};
//		removeDuplicatesFromArray_1(ar);
//		
//		int a[] = {2,2,2,2,2,2,2};
//		removeDuplicatesFromArray_1(a);
	}
	
	private static void removeDuplicatesFromArray_5(int[] arr) {

		System.out.println("removeDuplicatesFromArray_6......");

		Arrays.sort(arr);
		int num = arr[0];
		List<Integer> lt = new ArrayList<>();
		lt.add(num);
		for(int i:arr) {
			if(num != i) {
				lt.add(i);
				num=i;
			}
		}
		
		System.out.println("array value : "+lt);
		System.out.println("array length : "+lt.size());
	}

	private static void removeDuplicatesFromArray_4(int[] arr) {

		System.out.println("removeDuplicatesFromArray_4......");

		List<Integer> lt = new ArrayList<>();
		
		for (int i: arr) {
			if(!lt.contains(i)) {
				lt.add(i);
			}
		}
		
		System.out.println("array value : "+lt);
		System.out.println("array length : "+lt.size());
	}

	private static void removeDuplicatesFromArray_3(int[] arr) {

		System.out.println("removeDuplicatesFromArray_3......");

		Arrays.sort(arr);
		int num = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(num != arr[i]) {
				num = arr[i];
			} else {
				arr = ArrayUtils.remove(arr, i);
				i = i-1;
			}
		}
		
		System.out.print("array value : ");
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println("\narray length : "+arr.length);
	}
	
	private static void removeDuplicatesFromArray_2(int[] arr) {
		
		System.out.println("removeDuplicatesFromArray_2......");
		
		Set<Integer> st = new HashSet<>();
		for(int i:arr) {
			st.add(i);
		}
		
		System.out.println("array value: "+st);
		System.out.println("array length : "+st.size());
	}
	
	private static void removeDuplicatesFromArray_1(int[] arr) {
		
		System.out.println("removeDuplicatesFromArray_1......");
		
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
		
		System.out.print("array : ");
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]);
		}
		System.out.println("\narray length : "+arr.length);
	}

}
