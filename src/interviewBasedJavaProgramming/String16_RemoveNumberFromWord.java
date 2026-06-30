package interviewBasedJavaProgramming;

public class String16_RemoveNumberFromWord {
	public static void main(String[] args) {
		String str="I 124 Love23 India67";//I Love India
		String st = str.replaceAll("\\d+", "");//I  Love India
		String s = st.replaceAll("\\s+"," ");//I Love India
		System.out.println(s);
	}
}
