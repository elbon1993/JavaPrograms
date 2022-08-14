package strings;

public class StringLength {
	public static void main(String[] args) {
		String str = "JavaProgramming";
		int len = 0;
		while (true) {
			try {
				str.charAt(len);
				len++;
			} catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println(len);
	}
}
