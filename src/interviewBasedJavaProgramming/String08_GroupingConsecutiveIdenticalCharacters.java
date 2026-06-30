package interviewBasedJavaProgramming;

public class String08_GroupingConsecutiveIdenticalCharacters {
	public static void main(String[] args) {
		String str="aabbaddc";
		for (int i = 0; i <str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				System.out.print(str.charAt(i));
			}else {
				System.out.println(str.charAt(i));
			}
		}
		System.out.println(str.charAt(str.length()-1));
	}
}
