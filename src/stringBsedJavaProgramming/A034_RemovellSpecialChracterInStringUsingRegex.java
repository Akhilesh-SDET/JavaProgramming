package stringBsedJavaProgramming;

public class A034_RemovellSpecialChracterInStringUsingRegex {

	public static void main(String[] args) {
		String str="A#$0bht76&*";
		String st = str.replaceAll("[^A-za-z0-9]","");
		System.out.println(st);
	}
}
