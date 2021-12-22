package dataStructure;

public class ShellSort {

	public static void main(String[] args) {
		shellSortExample();

	}

	private static void shellSortExample() {
		int arr[] = { 23, 29, 15, 19, 31, 77, 90, 50, 28 };

		for (int p = arr.length / 2; p > 0; p = p / 2) {
			for (int i = p; i < arr.length; i++) {
				for (int j = i - p; j >= 0; j -= p) {
					if (arr[j] > arr[j + p]) {
						swap(j, j + p, arr);
					} else {
						break;
					}
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	private static void swap(int j, int i, int[] arr) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}

}
