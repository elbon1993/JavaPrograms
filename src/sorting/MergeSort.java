package sorting;

public class MergeSort {
	public static void main(String[] args) {

		int[] arr = { 6, 4, 8, 3, 2, 5, 1, 7 };
		System.out.println("Before sorting:");
		printArray(arr);
		new MergeSort().sort(arr, 0, arr.length - 1);
		System.out.println("After merge sort: ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		
		for (int item : arr) {
			System.out.print(" " + item);
		}
		System.out.println();
	}

	private void sort(int[] arr, int lb, int up) {

		if (lb < up) {
			int mid = (lb + up) / 2;
			sort(arr, lb, mid);
			sort(arr, mid + 1, up);
			merge(arr, lb, mid, up);
		}
	}

	private static void merge(int[] arr, int lb, int mid, int up) {

		int n1, n2;
		n1 = mid - lb + 1;
		n2 = up - mid;
		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[lb + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];
		int i=0, j=0;
		int k = lb;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
