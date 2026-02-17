package stringBsedJavaProgramming;

public class A002_ConvertUpperToLowerCaseAndLowerToUpper {
	public static void main(String[] args) {
		String str = "Bengaluru";
		String st="";
		for (int i = 0; i <=str.length()-1; i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				st=st+(char)+(str.charAt(i)+32);
			}else {
				st=st+(char)(str.charAt(i)-32);
			}
		}
		System.out.println(st);
	}
}
