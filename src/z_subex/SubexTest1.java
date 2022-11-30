package z_subex;

import java.util.ArrayList;
import java.util.List;

public class SubexTest1 {

	
	static String ConvertIntoString = "";
	static boolean success = true;
	public static void main(String[] args) {
		
		 int arr[] = {835,852};
		 
//		FindMaximumNumber(arr);
		
		List<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(835);
		list.add(83);
		list.add(22);
		list.add(23);
		list.add(23);
		list.add(92);
		list.add(92);
		 
		/*
		 * This code is to find the maximum number after 
		 * combining all the number in order.
		 */
//		String num=FindMaximumumberList(list);
//		System.out.println("maximum cobined number : "+num);
		
		List<Integer> maxNum = FindMaximumNumberList_2(list);
		System.out.println(maxNum);
	}

	private static List<Integer> FindMaximumNumberList_2(List<Integer> list) {
		List<Integer> maxLt = new ArrayList<>();
		maxLt.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			int lgt = maxLt.size();
			int swapIndex = 0;
			while (lgt != 0) {
				int num1 =list.get(i);
				int num2 = maxLt.get(lgt - 1);
				int lgtNum1 = findLengthOfNum(num1);
				int lgtNum2 = findLengthOfNum(num2);
				int lgt1 = lgtNum1 > lgtNum2 ? lgtNum2 : lgtNum1;

				int d1 = getDivisible(lgtNum1);
				int d2 = getDivisible(lgtNum2);

				int n1 = num1;
				int n2 = num2;
				int isSwap = 0;

				if (swapIndex == 0 && maxLt.contains(num1)) {
					maxLt.add(maxLt.indexOf(num1), num1);
					break;
				}
				int j = 0;
				while (j <= lgt1 - 1) {
					int l1 = n1 > 10 ? n1 / d1 : n1;
					int l2 = n2 > 10 ? n2 / d2 : n2;
					if (l1 > l2) {
						isSwap = num1;
						break;
					} else if (l2 > l1) {
						isSwap = num2;
						break;
					}
					n1 = n1 % d1;
					n2 = n2 % d2;
					d1 = d1 > 10 ? d1 / 10 : d1;
					d2 = d2 > 10 ? d2 / 10 : d2;
					j++;
				}

				if (isSwap == 0) {
					if (swapIndex != 0) {
						maxLt.remove(swapIndex);
					}
					if (lgtNum2 > lgtNum1) {
						maxLt.add(lgt - 1, num2);
					} else {
						maxLt.add(lgt - 1, num1);
					}
					swapIndex = lgt - 1;
				} else {
					if (isSwap == num2) { 
						if (swapIndex != 0) {
							if (maxLt.get(swapIndex) == num1) {
								break;
							}
						} else {
							maxLt.add(num1);
						}
						break;
					} else {
						if (swapIndex != 0) {
							maxLt.remove(swapIndex);
						}
						maxLt.add(lgt - 1, num1);
						swapIndex = lgt - 1;
					}
				}

				lgt = lgt - 1;
			}
		}

		return maxLt;
	}

	private static int getDivisible(int num) {
		// TODO Auto-generated method stub
		int d = 10;
		for(int i=1; i<num-1; i++) {
			d *=d;
		}
		return d;
	}

	private static int findLengthOfNum(Integer num) {
		int n = num;
		int lgt = 0;
		while(n != 0) {
			n = n/10;
			lgt++;
		}
		return lgt;
		
	}

	private static String FindMaximumumberList(List<Integer> list) {
		String longestNumber = "";int index;
		while (!list.isEmpty()) {
			if (list.size() == 1) {
				longestNumber = longestNumber + list.get(0);
				break;
			} else {
				int num = MaximumNumber(list);

				longestNumber = longestNumber + num;
				index = list.indexOf(num);
				list.remove(index);
//			System.out.println(list.size()+" "+list);
			}
		}

		return longestNumber;
		
	}

	private static int MaximumNumber(List<Integer> list) {
		char num = (list.get(0) + ConvertIntoString).charAt(0);
		int fnum = list.get(0);
		int longestNumber = 0;
		int listSize = list.size();

		for (int i = 1; i < listSize; i++) {
			success = true;
			success = CompairingValue(fnum, num, list.get(i), 0);

			if (success == false) {
				int temp = fnum;
				fnum = list.get(i);
//				System.out.println(list.indexOf(temp));
				list.set(0, fnum);
				list.set(i, temp);

				num = (fnum + "").charAt(0);
			}

			longestNumber = fnum;
		}

//		System.out.println(longestNumber);
		return longestNumber;

	}

	private static void FindMaximumNumber(int[] arr) {
		char num = (arr[0] + ConvertIntoString).charAt(0);
		System.out.println();
		int fnum = arr[0];
		String longestNumber = "";
		for (int i = 1; i < arr.length; i++) {
			success = true;
			success = CompairingValue(fnum, num, arr[i], 0);

			if (success == false) {
				int temp = fnum;
				fnum = arr[i];
				arr[i] = temp;

				num = (fnum + ConvertIntoString).charAt(0);
			}

			longestNumber = fnum + ConvertIntoString;
		}

//		System.out.println(longestNumber);

	}

	private static boolean CompairingValue(int fnum, char num, int arr, int index) {

//		System.out.println((arr+"").charAt(index));
		if (num < ((arr + ConvertIntoString).charAt(index))) {
			success = false;
		} else if (num == ((arr + ConvertIntoString).charAt(index))) {
			if ((fnum + ConvertIntoString).length() >= (index + 2) && (arr + ConvertIntoString).length() >= (index + 2)) {
				num = (fnum + ConvertIntoString).charAt(index + 1);
				success = CompairingValue(fnum, num, arr, index + 1);
			} else {
				success = false;
			}
		}

		return success;
	}

}
