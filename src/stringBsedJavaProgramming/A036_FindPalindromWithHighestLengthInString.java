package stringBsedJavaProgramming;

public class A036_FindPalindromWithHighestLengthInString {

	public static void main(String[] args) {
		String str = "abacmomommalayalam";
		String max="";
		for (int i = 0; i <str.length(); i++) {
			String temp="";			
			for (int j =i; j < str.length(); j++) {
				temp=str.substring(i,j+1);
				if(isPalindrom(temp)) {
					if(temp.length()>max.length()) {
						max=temp;
					}
				}
			}			
		}
		System.out.println(max);
	}
	public static boolean isPalindrom(String s) {
		int start=0;
		int end =s.length()-1;
		while(end>start) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
