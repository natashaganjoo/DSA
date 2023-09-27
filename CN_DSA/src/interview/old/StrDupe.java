package interview.old;

import java.util.HashMap;
import java.util.Set;

public class StrDupe {

	public static void findDupe(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i< s.length(); i++) {
			if(hm.containsKey(s.charAt(i))){
				int count = hm.get(s.charAt(i));
				count++;
				hm.put(s.charAt(i), count);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}
	

	public static boolean anagram(String s1, String s2) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i< s1.length(); i++) {
			if(hm.containsKey(s1.charAt(i))){
				int count = hm.get(s1.charAt(i));
				count++;
				hm.put(s1.charAt(i), count);
			}
			else {
				hm.put(s1.charAt(i), 1);
			}
		}
//		System.out.println(hm);
		
		
		for (int j = 0; j < s2.length(); j++) {
			if(hm.containsKey(s2.charAt(j))){
				int cnt = hm.get(s2.charAt(j));
				cnt--;
				hm.put(s2.charAt(j), cnt);
			}
			else {
				return false;
			}
		}
		
		Set<Character> set = hm.keySet();
		
		for(Character s: set) {
//			System.out.println(s);
			if(hm.get(s) != 0) {
				return false;
			}
		}
		System.out.println(hm);
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "natasha";
		
//		findDupe(s);
		String s1 = "amy";
		System.out.println(anagram(s1, "mary"));
	}

}
