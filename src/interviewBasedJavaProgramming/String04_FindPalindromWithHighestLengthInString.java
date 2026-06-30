package interviewBasedJavaProgramming;

public class String04_FindPalindromWithHighestLengthInString {
	public static void main(String[] args) {
			String str = "abacmomommalayalam";
			//String str = "abac";
			String result="";
			
			for (int i = 0; i <str.length()-1; i++) {
				String temp=""+str.charAt(i);
				
				for (int j = i+1; j <str.length(); j++) {
					
					temp=temp+str.charAt(j);
					if(isPalidrom(temp)) {
						if(temp.length()>result.length()) {
							result=temp;
						}
					}
				}
			}
			System.out.println(result);
		}	
		public static boolean isPalidrom(String s) {
			int start=0;
			int end=s.length()-1;
			while(start<end) {
				if(s.charAt(start) !=s.charAt(end)) {
					return false;
				}
				start++;
				end--;
			}
			return true;
	}
}
