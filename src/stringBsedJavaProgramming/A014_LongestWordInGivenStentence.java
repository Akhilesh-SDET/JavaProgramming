package stringBsedJavaProgramming;

public class A014_LongestWordInGivenStentence{
public static void main(String[] args) {
	String str="In The Boax";
	String[] st = str.split(" ");
	int length=0;
	String longetWord="";
	for(String e :st) {
		if(e.length()>length) {
			length=e.length();
			longetWord=e;
		}
	}
	System.out.println("longest length word " +length);
	System.out.println("longest length word " +longetWord);
}
}
