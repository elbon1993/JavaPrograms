
public class MissingNumbers {

	public static void main(String[] args) {
		int[] arr = {2,4,5,8,9};
		int n= 10;
		System.out.println("Given numbers:");
		printArray(arr);
		System.out.println("Missing numbers:");
		missingNumbers(arr, n);
		
	}

	private static void missingNumbers(int[] arr, int limit) {
		
		int i=0;
		int num=arr[0];
		while(num<limit){
			if(arr[i]==num){
				i++;
				num++;
			} else {
				System.out.print(num+"  ");
				num++;
			}
		}
	}

	private static void printArray(int[] arr) {
		for(int item: arr){
			System.out.print(item+"  ");
		}
		System.out.println();
	}
}
