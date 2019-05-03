package sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = { 6, 4, 8, 3, 2, 5, 1, 7 };
		System.out.println("Before sorting:");
		printArray(arr);
		sort(arr, 0, arr.length-1);
		System.out.println("After sorting:");
		printArray(arr);
	}
	
	private static void printArray(int[] arr) {
		
		for (int item : arr) {
			System.out.print(" " + item);
		}
		System.out.println();
	}
	
	private static void sort(int[] arr, int lb, int ub) {
		
		int i, j, pivot;
		int size=arr.length;
		if(lb<ub){
			i = lb;
			j = ub + 1;
			pivot = arr[lb];
			while(i<j){
				i++;
				while(i<size && arr[i]<pivot)
					i++;
				j--;
				while(j>=0 && arr[j]>pivot)
					j--;
				if(i<j)
					swap(arr, i, j);
			}
			swap(arr, j, lb);
			sort(arr, lb, j-1);
			sort(arr, j+1, ub);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
