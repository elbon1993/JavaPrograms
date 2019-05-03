package strings;

public class MoveUpperToEnd {

	public static void main(String[] args) {
		String str = "Hello India";
		System.out.println("With one string: " + withOneString(str, str.length()));
		System.out.println("With two string: " + withTwoStrings(str, str.length()));
		System.out.println("With Regex: " + withRegex(str, str.length()));
	}

	private static String withRegex(String str, int length) {
		return str.replaceAll("[A-Z]", "")+str.replaceAll("[^A-Z]","");
	}

	private static String withTwoStrings(String str, int n) {

		String upStr = "", lowStr = "";
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				upStr += str.charAt(i);
			else
				lowStr += str.charAt(i);
		}
		return lowStr + upStr;
	}

	private static String withOneString(String str, int n) {

		char[] strArr = str.toCharArray();
		int count = 0;	// To avoid cycle
		for (int i = 0; i < n; i++) {
			if (count < n && strArr[i] >= 'A' && strArr[i] <= 'Z') {
				char temp = strArr[i];
				int j;
				for (j = i; j < n - 1; j++) {
					strArr[j] = strArr[j + 1];
				}
				strArr[j] = temp;
				i--;
			}
			count++;
		}
		return String.valueOf(strArr);
	}
}
