package stringProgramming;

public class A005_ReverseTheString {

	public static void main(String[] args) {
		String str="Bengaluru";
		String st="";
		for (int i=str.length()-1;i>=0;i--){
					st=st+str.charAt(i);
		}
		System.out.println(st);
	}
}
