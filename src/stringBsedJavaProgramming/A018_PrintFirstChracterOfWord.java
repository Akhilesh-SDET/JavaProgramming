package stringBsedJavaProgramming;

public class A018_PrintFirstChracterOfWord {
	public static void main(String[] args) {
         String str="In The Boxes";
         String[] st = str.split(" ");
         for(String e: st) {
        	 System.out.println(e.charAt(0));
         }
	}
}
