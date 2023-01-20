package arrays;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 3, 4, 2, 1, 5 };
		int target = 9;
		int result[] = new int[3];
		// sort because then 2 pointer approach can be applied, if not sorted hiw will we know right++ or leftt++
		Arrays.sort(nums);
// keep i fixed and follow 2 ponter 
		for (int i = 0; i < nums.length - 1; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				if (nums[left] + nums[right] + nums[i] == target) {
					result[0] = nums[left];
					result[1] = nums[right];
					result[2] = nums[i];
					left++;
					right--;
				} else if (nums[left] + nums[right] + nums[i] < target) {
					left++;
				} else if (nums[left] + nums[right] + nums[i] > target) {
					right--;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
