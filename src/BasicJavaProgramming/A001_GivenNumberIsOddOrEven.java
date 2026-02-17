package BasicJavaProgramming;

public class A001_GivenNumberIsOddOrEven {
	public static String display(int n) {
		return (n%2==0)? "Even" : "Odd";	
	}

	public static void main(String[] args) {
		System.out.println(display(5));
	}
}
