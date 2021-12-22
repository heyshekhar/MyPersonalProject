package src.z_subex;

import java.util.ArrayList;
import java.util.List;

public class SubexTest1 {

	
	static String ConvertIntoString = "";
	static boolean success = true;
	public static void main(String[] args) {
		
		 int arr[] = {835,852};
		 
//		FindMaximumNumber(arr);
		
		List<Integer> list = new ArrayList<>();
		list.add(835);
		list.add(83);
		list.add(22);
		list.add(23);
		list.add(92);
		list.add(92);
		 
		
		String num=FindMaximumumberList(list);
		
		System.out.println(num);

	}

	private static String FindMaximumumberList(List<Integer> list) {
		String longestNumber = "";int index;
		while(!list.isEmpty())
		{
			if(list.size()==1)
			{
				longestNumber = longestNumber+list.get(0);
				break;
			}
			else
			{
				int num = MaximumNumber(list);
			
			longestNumber = longestNumber+num;
			index = list.indexOf(num);
			list.remove(index);
//			System.out.println(list.size()+" "+list);
			}
		}
		
		return longestNumber;
		
	}

	private static int MaximumNumber(List<Integer> list) {
		char num = (list.get(0)+ConvertIntoString).charAt(0);
		int fnum = list.get(0);
		int longestNumber = 0;
		int listSize = list.size();
		
		for(int i=1; i<listSize; i++)
		{
			success = true;
			success=CompairingValue(fnum,num,list.get(i),0);
			
			if(success == false)
			{
				int temp = fnum;
				fnum = list.get(i);
//				System.out.println(list.indexOf(temp));
				list.set(0,fnum);
				list.set(i, temp);
				
				num = (fnum+"").charAt(0);
			}
				
			longestNumber = fnum;
		}
		
//		System.out.println(longestNumber);
		return longestNumber;
		
	}

	private static void FindMaximumNumber(int[] arr) {
		char num = (arr[0]+ConvertIntoString).charAt(0);
		System.out.println();
		int fnum = arr[0];
		String longestNumber = "";
		for(int i=1; i<arr.length; i++)
		{
			success = true;
			success=CompairingValue(fnum,num,arr[i],0);
			
			if(success == false)
			{
				int temp = fnum;
				fnum = arr[i];
				arr[i] = temp;
				
				num = (fnum+ConvertIntoString).charAt(0);
			}
				
			longestNumber = fnum+ConvertIntoString;
		}
		
//		System.out.println(longestNumber);
		
	}

	private static boolean CompairingValue(int fnum, char num, int arr, int index) {
		int check;
		int temp;
		
//		System.out.println((arr+"").charAt(index));
		if(num<((arr+ConvertIntoString).charAt(index)))
				{
					success = false;
				}
		else if(num==((arr+ConvertIntoString).charAt(index)))
		{
			if((fnum+ConvertIntoString).length()>=(index+2) && (arr+ConvertIntoString).length()>=(index+2))
			{
				num = (fnum+ConvertIntoString).charAt(index+1);
				success=CompairingValue(fnum,num,arr,index+1);
			}
			else
			{
				success = false;
			}
		}
		
		return success;
	}

}
