import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String mailRegEx = getEMaliRegEx();
		String ipRegEx = getIPRegEx();
		
		String mail = "chandrahas.chatta@gmail.com";
		String ip = "192.168.0.1";
		System.out.println("Mail:"+ Pattern.matches(getEMaliRegEx(), mail));
		System.out.println("IP:"+ Pattern.matches(getIPRegEx(), ip));
	}

	private static String getIPRegEx() {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		return zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	}

	private static String getEMaliRegEx() {
		return "[a-zA-Z0-9][a-zA-Z0-9[._]]{5,}[@][a-zA-Z0-9[._]]{2,}[.][a-zA-Z0-9]{2,}";
	}
}
