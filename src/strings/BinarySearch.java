package strings;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		String[] friends = {"chandu","talari","teja","tarun","venu","ravi","kiran","bhanu","deva","selva","anil"};
		String key = "kiran";
		Arrays.sort(friends);
		System.out.println("Sorted list:"+Arrays.asList(friends));
		int res= binarySearch(friends, 0, friends.length-1, key);
		if(res==-1)
			System.out.println(key+" not found");
		else
			System.out.println(key+" found at position:"+res);
	}

	private static int binarySearch(String[] friends, int lb, int ub, String key) {
		if(lb<=ub){
			int mid = (lb+ub)/2;
			int res = key.compareTo(friends[mid]);
			if(res == 0){
				return mid; 
			} else if(res < 0){
				return binarySearch(friends, lb, mid-1, key);
			} else if(res > 0){
				return binarySearch(friends, mid+1, ub, key);
			}
		}
		return -1;
		
	}
}
