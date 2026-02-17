package stringProgramming;

public class A001_PrintEachChracter {
	public static void main(String[] args) {
		String str = "Bengaluru";
		for (int i = 0; i <=str.length()-1; i++) {
			System.out.println(str.charAt(i));
		}
	}
}
