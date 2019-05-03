package strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "programming";
		System.out.println("Given string:"+ str);
		System.out.println("Reverse string with char array: "+ reverseString(str));
		System.out.println("Reverse string with sub string: "+ reverseStringSubString(str));
	}

	private static String reverseString(String str) {
		char[] strArr = str.toCharArray();
		int left = 0, right = str.length() - 1;

		while (left < right) {
			swap(strArr, left, right);
			left++;
			right--;
		}
		return String.valueOf(strArr);
	}

	private static String reverseStringSubString(String str) {
		
		String reverseStr = str;
		
		int left = 0, right = str.length() - 1;
		while (left < right) {
			reverseStr = swap(reverseStr, left, right);
			left++;
			right--;
		}
		return reverseStr;
	}

	private static String swap(String str, int i, int j) {
		if(j == str.length()-1)
			return str.substring(0, i) + str.charAt(j) +
					str.substring(i+1, j) + str.charAt(i);
		else 
			return str.substring(0, i) + str.charAt(j) +
					str.substring(i+1, j) + str.charAt(i) +
					 str.substring(j+1);
	}

	private static void swap(char[] strArr, int left, int right) {
		char temp = strArr[left];
		strArr[left] = strArr[right];
		strArr[right] = temp;
	}
}
