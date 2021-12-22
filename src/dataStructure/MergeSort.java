package dataStructure;

public class MergeSort {

	public static void main(String[] args) {
		
		mergeSortExampleOne();

	}

	private static void mergeSortExampleOne() {
		// TODO Auto-generated method stub
		int arr[] ={10, 5, 2, 23, 45, 7};
		divideList(0, arr.length-1, arr);
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(" "+arr[i]);
		}
	}

	private static void divideList(int beg, int end, int[] arr) {
	
		if(beg<end) {
//			System.out.println("beg : "+beg+" end :"+end);
			int midIndex = (beg+end)/2;
			
			divideList(beg, midIndex, arr);
			divideList(midIndex+1, end, arr);
			conquerListSecond(beg,midIndex,end,arr);
			
		}
		
	}

	private static void conquerList(int beg, int midIndex, int end, int[] arr) {
		
		System.out.println("beg : "+beg+" end :"+end);
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		int begI, midI, endI, temp;
		begI = beg; midI = midIndex+1; endI= end;
		
		while(begI<=midIndex && midI<=end) {
			if(arr[begI]>arr[midI]) {
				swapList(begI, midI, arr);
				int s = begI;
				boolean isSwap = false;
				while(s+1<=midIndex && arr[s]>arr[s+1]) {
					swapList(s, s+1, arr);
					s++;
					isSwap = true;
					if(s>=midIndex) {
						break;
					}
				}
				
				if(!isSwap) {
					begI++;
				}
			}else {
				midI++;
			}
		}
		
		if(begI<midIndex) {
			midI=midIndex+1; 
			while (midI<=end && begI<=midIndex) {
				if(arr[begI]>arr[midI]) {
					swapList(begI, midI, arr);
					int s = midI;
					boolean isSwap = false;
					while(s+1<=end && arr[s]>arr[s+1]) {
						swapList(s, s+1, arr);
						s++;
						isSwap = true;
						if(s>=end) {
							break;
						}
					}
					if(!isSwap) {
						midI++; 
					}
					
				}else {
					begI++;
				}	
			}
		}
		
		
		System.out.println("output");
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}

	private static void swapList(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	

	private static void conquerListSecond(int beg, int midIndex, int end, int[] arr) {
		int begI, midI, begIndex;
		int leftArray[] = new int[midIndex-beg+1];
		int rightArray[] = new int[end-midIndex];
		midI = 0;begI = 0;
		begIndex = beg;

		for(int i=0; i<leftArray.length; i++) {
			leftArray[i] = arr[beg+i];
		}
		
		for(int j=0; j<rightArray.length; j++) {
			rightArray[j] = arr[midIndex+1+j];
		}
		
		while(begI<leftArray.length && midI<rightArray.length) {
			if(leftArray[begI]<rightArray[midI]) {
				arr[begIndex] = leftArray[begI];
				begIndex++; begI++;
			}else {
				arr[begIndex] = rightArray[midI];
				begIndex++;midI++;
			}
		}
		
		while(begI<leftArray.length) {
			arr[begIndex]= leftArray[begI];
			begIndex++;begI++;
		}
		
		while(midI<rightArray.length) {
			arr[begIndex] = rightArray[midI];
			
			begIndex++;midI++;
		}
		
		
	}
}
