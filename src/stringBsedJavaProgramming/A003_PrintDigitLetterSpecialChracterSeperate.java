package stringBsedJavaProgramming;

public class A003_PrintDigitLetterSpecialChracterSeperate {
	public static void main(String[] args) {
		String str="Abc123@m#%v5B";
		String l="";
		String u="";
		String s="";
		String d="";
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				u=u+str.charAt(i);
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				l=l+str.charAt(i);
			}else if(str.charAt(i)>='0' && str.charAt(i)<= '9') {
				d=d+str.charAt(i);
			}else {
				s=s+str.charAt(i);
			}
		}
		System.out.println(u+l+d+s);
	}
}
