package strings;


public class RemoveDupicateChars {

	public static String removeDuplicateChars(String str) {
		
		char[] arr1 = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr1.length; i++) {
			{
				for (int j = i+1; j < arr1.length; j++) {
					if(i != j) {
					if(arr1[i] == arr1[j]) {
						break;
					}}
					result = result + arr1[j];
				}
			
//				System.out.println(arr1[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		

		String str = "natasha";
		System.out.println(removeDuplicateChars(str));
	}

}
