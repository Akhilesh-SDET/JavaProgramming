package stringBsedJavaProgramming;

public class A023_RemoveFirstChracterOfEachWord {
	public static void main(String[] args) {
        String str="In The Boxes";
        String[] st = str.split(" ");
        for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].substring(1));
		}
	}
}
