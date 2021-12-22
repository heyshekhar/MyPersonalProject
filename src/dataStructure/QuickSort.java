package dataStructure;

public class QuickSort {
	static int startNum = 0; 
	static boolean endStartingNum = true;
	
	public static void main(String arg[]) {
		
//		quickSortUsingArray();
		
//		quickSortUsingArraySecond();
		
		quickSortUsingArrayThrid();
	}

	private static void quickSortUsingArrayThrid() {
        int[] arr=
//        	{90,23,101,45,65,23,67,89,34,23};
        {10,80,30,90,40,50,70};
        
        quickSortFuntion(0, arr.length-1, arr);
        for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	private static void quickSortFuntion(int beg, int end, int[] arr) {
		
		int pivote;
		if(beg<end) {
			pivote =  devideAndSort(beg, end, arr);
			quickSortFuntion(beg, pivote-1, arr);
			quickSortFuntion(pivote+1, end, arr);
		}
		
	}

	private static int devideAndSort(int beg, int end, int[] arr) {
		int left, pivote; 
		int right = end;
		pivote = left= beg;
		boolean isDone = false;
		
		while(!isDone) {
			
			while(arr[pivote] <= arr[right] && (pivote != right)) {
				right--;
			}
			if (pivote == right){
				isDone = true;
				break;
			}else if(arr[pivote] > arr[right]) {
				swap(pivote, right, arr);
				pivote = right;
			} 
			
			while(arr[pivote] >= arr[left] && (pivote != left)) {
				left++;
			}
			
			if (pivote == left){
				isDone = true;
				break;
			}else if(arr[pivote] < arr[left]) {
				swap(pivote, left, arr);
				pivote = left;
				
			}
		}
		
		return pivote;
		
	}

	private static void swap(int pivote, int num, int[] arr) {
		int temp;
		temp = arr[pivote];
		arr[pivote] = arr[num];
		arr[num] = temp;
		
	}

	private static void quickSortUsingArraySecond() {
        int i;  
        int[] arr={90,23,101,45,65,23,67,89,34,23};  
        quickSort(arr, 0, 9);  
        System.out.println("\n The sorted array is: \n");  
        for(i=0;i<10;i++)  
        System.out.print(" " +arr[i]);  
  }

	private static void quickSort(int a[], int beg, int end) {
        
      int loc;  
      if(beg<end)  
      {  
          loc = partition(a, beg, end);  
          quickSort(a, beg, loc-1);  
          quickSort(a, loc+1, end);  
      } 
      
	}

	private static int partition(int[] a, int beg, int end) {
        
      int left, right, temp, loc, flag;     
      loc = left = beg;  
      right = end;  
      flag = 0;  
      while(flag != 1)  
      {  
          while((a[loc] <= a[right]) && (loc!=right))  
          right--;  
          if(loc==right)  
          flag =1;  
          else if(a[loc]>a[right])  
          {  
              temp = a[loc];  
              a[loc] = a[right];  
              a[right] = temp;  
              loc = right;  
          }  
          if(flag!=1)  
          {  
              while((a[loc] >= a[left]) && (loc!=left))  
              left++;  
              if(loc==left)  
              flag =1;  
              else if(a[loc] <a[left])  
              {  
                  temp = a[loc];  
                  a[loc] = a[left];  
                  a[left] = temp;  
                  loc = left;  
              }  
          }  
      }  
      return loc;  
      
	}

	private static void quickSortUsingArray() {
		
		int arr[] = {7, 4, 8, 1, 9, 3, 5};
		int pivoteIndex = 0;
		qucikSortFun(0, arr.length-1, arr, true,pivoteIndex);
		
//		System.out.print("sorted array");`
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(" "+sortArr[i]);
//		}
		
	}

	private static void qucikSortFun(int beg, int end, int[] arr, boolean isLeft, int pivoteIndex) {
		
		
		
		
//		
//		int pivote = arr[i]; boolean startFlag = false, endFlag = false;
//		boolean flag = true, isDone = false; boolean isSwap = false;
//		int temp = 0;
//	
//		if(j-i <= 1 && endStartingNum == false) {
//			return arr;		
//		}
//		while (flag) {
//			if(pivote < arr[i]) {
//				startFlag = true;
//			}else {
//				++i;
//			}
//			
//			if(pivote >= arr[j]) {
//				endFlag = true;
//			}else {
//				--j;	
//			}
//			
//			if(startFlag && endFlag) {
//				 temp = arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				++i;--j;
//				startFlag = false; endFlag = false;
//				isSwap = true;
//			}
//			
//			if(i>j) {
//				if(isSwap) {
//					temp = arr[0];
//					arr[0] = arr[--i];
//					arr[i] = temp;
//				}
//				
//				if(endStartingNum) {
//					startNum = i;
//					endStartingNum = false;
//				}
//				
//				qucikSortFun(0, i, arr);
//				endStartingNum = true;
//				qucikSortFun(++startNum, arr.length-1, arr);
//				isDone = true;
//			}else if(isDone) {
//				flag=false;
//			}
//		}
//		
//		return arr;
//		
		boolean isLeftDone = false;
		
		
		
		pivoteIndex = divideAndSort( beg,  end,  arr, isLeft, pivoteIndex);
		if(beg != end && !(beg> arr.length-1 || end<0)) {
			qucikSortFun(0, pivoteIndex-1, arr, true, pivoteIndex);
			isLeftDone = true;
		}
		
		if(isLeftDone) {
			qucikSortFun(pivoteIndex+1, end, arr, false, pivoteIndex);
		}
	}

	private static int divideAndSort(int beg, int end, int[] arr, boolean isLeft, int pivoteIndex) {
		int pivote = arr[beg];
//		int startIndex = isLeft ? beg : end;
		int startIndex = beg;
		int endIndex = end;
		boolean startFlag = false, endFlag = false;
		boolean flag = true, isDone = false; boolean isSwap = false;
		int temp = 0;
		
		if(beg != end) {
		while(!isDone) {
			if(beg> arr.length-1 || end<0) {
				beg = end;
				break;
			}
			if(pivote < arr[beg]) {
				startFlag = true;
			}else {
				++beg;
			}
			
			if(pivote >= arr[end]) {
				endFlag = true;
			}else {
				--end;	
			}
			
			if(startFlag && endFlag) {
				temp = arr[beg];
				arr[beg]=arr[end];
				arr[end]=temp;
				++beg;--end;
				startFlag = false; endFlag = false;
				isSwap = true;
			}
			
			if (beg > end) {
				temp = arr[startIndex];
				arr[startIndex] = arr[end];
				arr[end] = temp;
				isDone = true;
				pivoteIndex = end;
			}
		}
		}
		
		
		return pivoteIndex;
	}

}
