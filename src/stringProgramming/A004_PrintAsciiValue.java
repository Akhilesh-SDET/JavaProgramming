package stringProgramming;

public class A004_PrintAsciiValue {
public static void main(String[] args) {
	String str="Bengaluru";
	for (int i = 0; i <str.length(); i++) {
		System.out.println((int)str.charAt(i));
	}
}
}
