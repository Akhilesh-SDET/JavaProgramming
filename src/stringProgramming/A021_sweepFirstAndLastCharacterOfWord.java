package stringProgramming;

public class A021_sweepFirstAndLastCharacterOfWord {
	public static void main(String[] args) {
         String str="In The Boxes";
         String[] st = str.split(" ");
         for (int i = 0; i < st.length; i++) {
			char first=st[i].charAt(0);
			char last=st[i].charAt(st[i].length()-1);
			st[i]=last+st[i].substring(1,st[i].length()-1)+first;
			System.out.println(st[i]);
		}
	}
}
