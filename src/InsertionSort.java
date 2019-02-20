import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] arr, int n) {

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i -1;
			for (; j >=0 && arr[j]>key; j--) {
				arr[j+1] = arr[j];
			}
			if(i != j+1)
				arr[j+1] = key;
			printArray(arr);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 10, 12, 1, 5, 6 };

		insertionSort(arr, arr.length);

		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}
}
