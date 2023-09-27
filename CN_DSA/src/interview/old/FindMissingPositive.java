package interview.old;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMissingPositive {	
		
		
	
	public int missingusingHashMap(int[] arr) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 1; i <= arr.length; i++) {
			if (hm.containsKey(i)) {
				int cnt = hm.get(i);
				cnt++;
				hm.put(i, cnt);
			} else {
				hm.put(i, 1);
			}
		}

		for (int i : arr) {
			if(i>0) {
				if(hm.containsKey(i)) {
					hm.put(i, 0);
				}
			}
		}
		
		int cnt = 1;
		for(Map.Entry<Integer, Integer> i: hm.entrySet()) {
			if(i.getValue() != 0) {
				return i.getKey();
			}	
			cnt++;

			}

		if(cnt > arr.length) {
			return  cnt;
		}
		
		return 0;
	}

	public int missingUsingSet(int[] A) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 1; i<= A.length; i++ ) {
			hs.add(i);
		}
		
		for(int i: A) {
			if(i>0) {
			if(hs.contains(i)) {
				hs.remove(i);
			}
			}
		}
		
		System.out.println(hs);
		return 0;
	}
	public static void main(String[] args) {
		int arr[] = {-1, -3 };
		FindMissingPositive missing = new FindMissingPositive();
//		System.out.println(("missing number is: " + missing.missing(arr)));
		System.out.println(("missing number is: " + missing.missingUsingSet(arr)));


	}

}
