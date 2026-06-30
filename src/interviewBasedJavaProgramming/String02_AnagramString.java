package interviewBasedJavaProgramming;

import java.util.Arrays;

public class String02_AnagramString {
	public static void main(String[] args) {
         if(display("Listen","Selent")) {
        	 System.out.println("Both are Anargram String");
         }else {
          	 System.out.println("Both are Not Anargram String");
         }
	}
	
	public static boolean display(String s1,String s2) {
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length ==b.length) {
			for (int i = 0; i < b.length; i++) {
				if(a[i] !=b[i]) {
					return false;
				}
			}
		}else {
			return false;
		}
	return true;	
}
		
}
