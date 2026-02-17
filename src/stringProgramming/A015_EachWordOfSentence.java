package stringProgramming;

public class A015_EachWordOfSentence {
	public static void main(String[] args) {
          String str="In The Boxes";
         String[] st = str.split(" ");
         for(String e:st) {
        	 System.out.println(e);
         }
	}
}
