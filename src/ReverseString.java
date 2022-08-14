
public class ReverseString {
	public static void main(String[] args) {
		String str = "JavaProgram";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		if(str.length() == 1)
			return str;
		else
			return reverseString(str.substring(1, str.length())) + str.charAt(0);
	}
}
