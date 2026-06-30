package interviewBasedJavaProgramming;

public class String10_SweepTwoStringWithoutThirdVariable {
	public static void main(String[] args) {
		String a="Hello";
		String b="Java";
      	a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}
}
