package stringProgramming;

public class A025_ReverseEachWord {
	public static void main(String[] args) {
          String str="In The Boxes";
          String[] st = str.split(" ");
          for (int i = st.length-1; i >=0; i--) {
			System.out.println(st[i]);
		}
	}
}
