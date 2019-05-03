package strings;

public class ReplaceAll {
	// Function to extract the secret message
	static String usingReplaceAll(String Str, String Sub) {
		
		Str = Str.replaceAll(Sub, " ");
		Str = Str.trim();

		return Str;
	}

	private static String withoutReplaceAll(String str, String sub, String newSub) {
		

		StringBuffer result = new StringBuffer("");
		for(int i=0; i<str.length(); i++){
			int k = i;
			boolean flag = false;
			int j=0;
			for(; j<sub.length() && i<str.length(); j++, i++){
				if(str.charAt(i) != sub.charAt(j)){
					flag = true;
					break;
				}
			}
			
			if(i== str.length()){
				flag = true;
				if(i!=k)
					i=i-j;
			} else {
				if(i!=k)
					i--;
			}
			
			if(flag){
				if(i<str.length())
					result.append(str.charAt(i));
			}
			else
				result.append(newSub);
		}
		return result.toString();
	}

	// Driver code
	public static void main(String args[]) {
		String str = "LIELIEILIEAMLIECOOLI";
		String sub = "LIE";
		String newSub = "+";
		System.out.println(usingReplaceAll(str, sub));
		System.out.println(withoutReplaceAll(str, sub, newSub));
	}
}
