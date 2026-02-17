package stringBsedJavaProgramming;

import java.util.Arrays;

public class A035_AnagramString {
	public static void main(String[] args) {
         if(display("Listen","Selent"))
        	 System.out.println("Both are Anargram String");
	}
	
	public static boolean display(String s1,String s2) {
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		Arrays.sort(a);
        Arrays.sort(b);
		if(a.length !=b.length) {
			System.out.println("Both are not Anargram String b/z length are diff");
			return false;
		}else {
			for (int i = 0; i < b.length; i++) {
				if(a[i] !=b[i]) {
					System.out.println("Both are not Anargram String b/z chracter are different");
				return false;
				}
			}
		}
		
		return true;
	}
}
