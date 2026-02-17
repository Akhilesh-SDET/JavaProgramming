package stringProgramming;

public class A007_CheckGivenNumberIsPalindrom {
	public static void main(String[] args) {
		int n=12321;
		int n1=n;
		int res=0;
		while(n!=0) {
			res= res*10+n%10;
			n=n/10;
		}
		if(n1==res) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom ");
		}
	}
}
