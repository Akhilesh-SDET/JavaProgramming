package stringBsedJavaProgramming;

public class A031_seperatrconsecutiveCharacter {
	public static void main(String[] args) {
         String str="aabbaddc";
         for (int i = 0; i <str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				System.out.print(str.charAt(i));
			}else {
				System.out.println(str.charAt(i));
			}
		}
         System.out.print(str.charAt(str.length()-1));
	}
}
