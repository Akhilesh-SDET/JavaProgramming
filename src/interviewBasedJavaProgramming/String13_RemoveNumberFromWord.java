package interviewBasedJavaProgramming;

public class String13_RemoveNumberFromWord {
	public static void main(String[] args) {
		String str="l124 love23 India67";
		System.out.println("Replace All Number From String "+str.replaceAll("[0-9]", ""));
		System.out.println("Print Only Number From String "+str.replaceAll("[^0-9]", ""));
	    System.out.println("Print All Number without changing space From String "+str.replaceAll("[^0-9 ]", ""));
		
		
	}
}
