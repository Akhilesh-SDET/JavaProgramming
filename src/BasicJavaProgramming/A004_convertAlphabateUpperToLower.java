package BasicJavaProgramming;

public class A004_convertAlphabateUpperToLower {
	public static void main(String[] args) {
		char ch='B';
		if(ch>='A' && ch<='Z') {
			ch=(char)(ch+32);
		}else {
			ch=(char)(ch-32);
		}
		System.out.println(ch);
	}
}
