package strings;

import java.util.Arrays;
import java.util.Iterator;

public class CheckPermutation {

	/*
	 * compare the length of both the strs if its unequal then directly return false
	 * Approaches:
	 * 
	 * 1. Compare the ASCII values of both strings if its equal then it is a
	 * permutation of another
	 * 
	 * 2. Another way to approach this problem will be to sort both strings and then
	 * compare them. If they are equal, we can return true, else we’ll return false.
	 * The time complexity of this approach will be O(n * log(n)) which is much
	 * better than the complexity of the brute force approach but still has room for
	 * improvement.
	 * 
	 * 3. Another approach that doesn’t involve sorting the strings exists.
	 * Basically, all we have to do is to compare the frequencies of the characters
	 * in both strings. If the frequencies match, then we can conclude both strings
	 * are permutations of each other, otherwise they are not.
	 */

//	1.
	public static boolean checkPermutation(String str1, String str2) {

		if (str1.length() == str2.length()) {

			int sum1 = 0;
			int sum2 = 0;
			int i = 0;

			while (i < str1.length()) {
				sum1 = sum1 + str1.charAt(i);
				sum2 = sum2 + str2.charAt(i);
				i++;
			}
			if (sum1 == sum2) {
				return true;
			}
		}
		return false;
	}

//	2.
//	public static boolean checkPermutation(String str1, String str2) {
//		char arr1[] = str1.toCharArray();
//		char arr2[] = str2.toCharArray();
//
//		if(arr1.length == arr2.length)
//		{
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);
//	
//			int i = 0;
//			int j = 0;
//			while (i < arr1.length && j < arr2.length)
//			{
//				if(arr1[i] != arr2[j]) {
//					return false;
//				}
//			i++;
//			j++;
//			}
//			return true;
//		}
//		return false;
//	}

	public static void main(String[] args) {

		String str1 = "abcde";
		String str2 = "abcde";

		System.out.println(checkPermutation(str1, str2));
	}

}
