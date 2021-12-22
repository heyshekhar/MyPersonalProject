package datastructureExp;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,6,8,9,10};
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("please enter the number : ");
		int num = sc.nextInt();
		
		findTheNumber(array,num);
		
		findSecondLargestNumber(array);
		
	}

	private static void findSecondLargestNumber(int[] array) {
		
		int leng = array.length/2;
		int arr[] = new int[array.length];
		if(array.length<=2)
		{
			System.out.println("Second largest number :"+array[0]);
		}
		else
		{
				int a=0;
				arr = new int[array.length-leng];
				for(int i=leng; i<array.length; i++)
				{
					arr[a]=array[i];
					a++;
				}
				findSecondLargestNumber(arr);
			}
	}

	private static void findTheNumber(int[] array, int num) {
		
		int leng = array.length/2;
		int arr[] = new int[array.length];
		if(array.length<=1)
		{
			if(array[0]==num)
			{
				System.out.println("found the number :"+array[0]);
			}
			else
			{
				System.out.println("number is not present in the array");
			}
		}
		else
		{
			if(array[leng-1]>=num)
			{
				arr = Arrays.copyOf(array, arr.length-leng);
				findTheNumber(arr, num);
			}
			else
			{
				int a=0;
				arr = new int[array.length-leng];
				for(int i=leng; i<array.length; i++)
				{
					arr[a]=array[i];
					a++;
				}
				findTheNumber(arr, num);
			}
		}
	}

}
