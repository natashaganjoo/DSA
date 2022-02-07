package strings;

import java.util.Iterator;

public class MinLengthWord {

//	public static String countCharsinWord(String str) {
//		String word = "";
//		String finalString = "";
//		int start = 0;
//		int max = Integer.MAX_VALUE;
//		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				word = str.substring(start, i);
//				if(word.length() < max) {
//					max = word.length();
//					finalString = word;
//				}
//				System.out.println(word);
//				start = i+1;
//			}
//			else {
//				word = str.substring(start, i+1);
//				if(word.length() < max) {
//					max = word.length();
//					finalString = word;
//				}
//			}
//			
////			System.out.println(finalString);
//		}
//		return finalString;
//	}
	
	public static void countCharsinWord(String str) {
		int min = Integer.MAX_VALUE;
		String[] arr = str.split(" ");
		String wordString = "";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() < min) {
				min = arr[i].length();
				wordString = arr[i];
			}
			
		}
		System.out.println(min +" " +wordString);
	}
	public static void main(String[] args) {
		String s = "my name is natasha";
		countCharsinWord(s);
//		System.out.println("ans "+countCharsinWord(s));
	}

}
