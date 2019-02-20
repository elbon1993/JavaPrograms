package sorting;
import java.util.Arrays;

public class InsertionSortRecursive {

	static void insertionSortRecursive(int[] arr, int n) {

		if (n <= 1)
			return;

		insertionSortRecursive(arr, n - 1);

		int key = arr[n - 1];
		int j = n - 2;

		for (; j >= 0 && arr[j] > key; j--) {
			arr[j + 1] = arr[j];
		}
		arr[j + 1] = key;
		printArray(arr);
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 10, 12, 1, 5, 6 };

		insertionSortRecursive(arr, arr.length);

		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}
}
