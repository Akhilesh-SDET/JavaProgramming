package stringProgramming;

public class A026_ReverseEachWordAndEveryChtracter {
	public static void main(String[] args) {
        String str="In The Boxes";
        String[] st = str.split(" ");
        for (int i = st.length-1; i >=0; i--) {
			String word = st[i];
			for (int j = word.length()-1; j >=0; j--) {
				System.out.print(word.charAt(j));
			}
			System.out.println(" ");
		}
	}
}
