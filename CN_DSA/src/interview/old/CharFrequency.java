package interview.old;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
	
		String name = "ashish";
		char arr[] = name.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i< arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				int val = hm.get(arr[i]);
				val++;
				hm.put(arr[i], val);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		
		 for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	    }

	}

}
