package strings;

public class PrefixSubString {

	public static void main(String[] args) {

		String str = "abcdab";
		System.out.println("Without Recursion:");
		System.out.println("count::" + findPrefixStrings(str, str.length()));
		System.out.println("With Recursion:");
		System.out.println("count::" + findPrefixStringsRecursion(str, str.length()));
	}

	private static int findPrefixStrings(String str, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == str.charAt(0)) {
				for (int j = i + 1; j <= n; j++) {
					if (str.startsWith(str.substring(i, j))) {
						System.out.println(str.substring(i, j));
						count++;
					} else {
						break;
					}
				}
			}
		}
		return count;
	}

	private static int findPrefixStringsRecursion(String str, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == str.charAt(0))
				count += findSubString(str, n, i);
		}
		return count;
	}

	private static int findSubString(String str, int n, int start) {
		int count = 0;
		for(int i=start+1; i<=n; i++){
			if(str.startsWith(str.substring(start, i))){
				System.out.println(str.substring(start, i));
				count++;
			} else
				break;
		}
		return count;
	}

}
