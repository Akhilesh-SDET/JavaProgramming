package stringProgramming;

public class A024_WordEndingWithX {
	public static void main(String[] args) {
		String str="In The Box";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			String word = st[i];
			if(word.charAt(word.length()-1)=='x') {
				System.out.println(st[i]);
			}
		}
	}

}
