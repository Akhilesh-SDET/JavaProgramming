package stringBsedJavaProgramming;

public class A013_AddAllStringInteger {
public static void main(String[] args) {
	String str="12345";
	int res=0;
	for (int i = 0; i <str.length(); i++) {
		res=res+(str.charAt(i)-48);	
	}
	System.out.println(res);
}
}
