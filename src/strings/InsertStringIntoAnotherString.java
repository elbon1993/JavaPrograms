package strings;

public class InsertStringIntoAnotherString {
	public static void main(String[] args) {
		String orgStr = "welcome to programming";
		String insStr = "java ";
		int index = 11;
		System.out.println("After insertion: " + insertString(orgStr, insStr, index));
		System.out.println("After insertion - using substring: " + insertStringUsingSubstring(orgStr, insStr, index));
	}

	private static String insertString(String orgStr, String insStr, int index) {

		String result = "";

		for (int i = 0; i < orgStr.length(); i++) {
			if (i == index)
				result += insStr;
			result += orgStr.charAt(i);
		}
		return result;
	}

	private static String insertStringUsingSubstring(String orgStr, String insStr, int index) {
		return orgStr.substring(0, index) + insStr + orgStr.substring(index);
	}
}
