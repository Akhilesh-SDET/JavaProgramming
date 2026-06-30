package pratice2;

public class A007_Permutation {
	public static void main(String[] args) {
        String str="ABC";
        helper(str,"");
	}
	
	public static void helper(String s1, String s2) {
		for (int i = 0; i <s1.length(); i++) {
			char ch =s1.charAt(i);
			
			String left= s1.substring(0,i);
			String right = s1.substring(i + 1);
			String remaining = left + right;
			System.out.println(remaining);
		}
	}
}
