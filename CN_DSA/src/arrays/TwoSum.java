package arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3, 5, 4, 1, 9};
		int target = 6;
		int result[] = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i< nums.length; i++) {
			if(hm.containsKey(target - nums[i])) {	
				// if you have to return elements
//				result[0] = nums[i];
//				result[1] = target - nums[i];
				// if indices
				result[0] = i;
				result[1] = hm.get(target - nums[i]);
			}
			else {
				hm.put(nums[i], i);
			}
		}
		
		for(int i = 0; i< result.length; i++) {
		System.out.println(result[i]);
		}
	}

}
