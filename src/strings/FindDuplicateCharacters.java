package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
	public static void main(String args[]) {

		findWithMap("programming");
		findWithSet("programming");
		findWithLoops("programming");
		
	}

	private static void findWithLoops(String s) {
		System.out.println("With loops duplicate characters");
		for(int i=0; i<s.length();i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j))
					System.out.println(s.charAt(i));
			}
		}
	}

	private static void findWithSet(String s) {
		
		System.out.println("With Set duplicate characters");
		Set<Character> set = new HashSet<>();
		for (Character name : s.toCharArray()) {
		     if (set.add(name) == false) {
		    	 System.out.println(name);
		     }
		}
	}

	private static void findWithMap(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println("With Hash Map");
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
	}
}
