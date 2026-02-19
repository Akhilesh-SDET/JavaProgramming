package interviewBasedJavaProgramming;

public class String12_SweepTwoStringWithoutThirdVariable {
	public static void main(String[] args) {
		String a="Hello";
		String b="Java";
		String c=a+b;
		a=c.substring(a.length(),c.length());
		b=c.substring(0,c.length()-a.length());
		System.out.println(a);
		System.out.println(b);
	}
}
